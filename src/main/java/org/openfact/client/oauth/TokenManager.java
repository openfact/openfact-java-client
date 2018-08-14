package org.openfact.client.oauth;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;
import java.io.IOException;

public class TokenManager {

    private static int offset;
    private static final long DEFAULT_MIN_VALIDITY = 30;

    private final ResteasyWebTarget target;

    private final String clientId;

    private String refreshToken;
    private AccessTokenResponse accessToken;

    private long expirationTime;

    public TokenManager(String clientId, String tokenServerUrl) {
        this.clientId = clientId;

        ResteasyClient client = new ResteasyClientBuilder().build();
        this.target = client.target(tokenServerUrl);
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public AccessTokenResponse getAccessToken() {
        if (refreshToken == null) {
            return null;
        }
        if (accessToken == null || tokenExpired()) {
            refreshToken();
        }
        return accessToken;
    }

    /**
     * Invalidates the current token, but only when it is equal to the token passed as an argument.
     *
     * @param token the token to invalidate (cannot be null).
     */
    public synchronized void invalidate(String token) {
        if (accessToken == null) {
            return; // There's nothing to invalidate.
        }
        if (token.equals(accessToken.getToken())) {
            // When used next, this cause a refresh attempt, that in turn will cause a grant attempt if refreshing fails.
            expirationTime = -1;
        }
    }

    private boolean tokenExpired() {
        return (currentTime() + DEFAULT_MIN_VALIDITY) >= expirationTime;
    }

    private void refreshToken() {
        Form form = new Form();
        form.param("grant_type", "refresh_token");
        form.param("refresh_token", refreshToken);
        form.param("client_id", clientId);

        int requestTime = currentTime();
        Response response = target.request().post(Entity.form(form));
        accessToken = getAccessTokenFromResponse(response);
        if (accessToken != null) {
            expirationTime = requestTime + accessToken.getExpiresIn();
        }
    }

    private int currentTime() {
        return ((int) (System.currentTimeMillis() / 1000)) + offset;
    }

    public static AccessTokenResponse getAccessTokenFromResponse(Response response) {
        if (response.getStatusInfo().getFamily().equals(Response.Status.Family.SUCCESSFUL)) {
            String responseString = response.readEntity(String.class);
            ObjectMapper mapper = new ObjectMapper();
            try {
                return mapper.readValue(responseString, AccessTokenResponse.class);
            } catch (IOException e) {
                throw new IllegalStateException("Could not parse token");
            }
        }
        return null;
    }
}
