package org.openfact.client.oauth;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.core.HttpHeaders;
import java.io.IOException;
import java.util.List;

public class BearerAuthFilter implements ClientRequestFilter, ClientResponseFilter {

    public static final String AUTH_HEADER_PREFIX = "Bearer ";
    private final String tokenString;
    private final TokenManager tokenManager;

    public BearerAuthFilter(String tokenString) {
        this.tokenString = tokenString;
        this.tokenManager = null;
    }

    public BearerAuthFilter(TokenManager tokenManager) {
        this.tokenManager = tokenManager;
        this.tokenString = null;
    }

    @Override
    public void filter(ClientRequestContext clientRequestContext) throws IOException {
        String authHeader = (tokenManager != null ? tokenManager.getAccessToken().getToken() : tokenString);
        if (!authHeader.startsWith(AUTH_HEADER_PREFIX)) {
            authHeader = AUTH_HEADER_PREFIX + authHeader;
        }
        clientRequestContext.getHeaders().add(HttpHeaders.AUTHORIZATION, authHeader);
    }

    @Override
    public void filter(ClientRequestContext clientRequestContext, ClientResponseContext clientResponseContext) throws IOException {
        if (clientResponseContext.getStatus() == 401 && tokenManager != null) {
            List<Object> authHeaders = clientRequestContext.getHeaders().get(HttpHeaders.AUTHORIZATION);
            if (authHeaders == null) {
                return;
            }
            for (Object authHeader : authHeaders) {
                if (authHeader instanceof String) {
                    String headerValue = (String) authHeader;
                    if (headerValue.startsWith(AUTH_HEADER_PREFIX)) {
                        String token = headerValue.substring( AUTH_HEADER_PREFIX.length() );
                        tokenManager.invalidate( token );
                    }
                }
            }
        }
    }

}
