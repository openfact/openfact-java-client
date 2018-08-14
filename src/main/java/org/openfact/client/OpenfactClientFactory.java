package org.openfact.client;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.openfact.client.oauth.BearerAuthFilter;
import org.openfact.client.oauth.TokenManager;
import org.openfact.client.services.DocumentsService;

public class OpenfactClientFactory {

    private OpenfactClientFactory() {
        // Just static methods
    }

    public static TokenManager getTokenManager(String clientId, String tokenServerUrl, String offlineToken) {
        TokenManager tokenManager = new TokenManager(clientId, tokenServerUrl);
        tokenManager.setRefreshToken(offlineToken);
        return tokenManager;
    }


    public static DocumentsService getDocumentsService(String openfactServerUrl, TokenManager tokenManager) {
        ResteasyClient client = new ResteasyClientBuilder().connectionPoolSize(10).build();
        ResteasyWebTarget target = client.target(openfactServerUrl);
        target.register(new BearerAuthFilter(tokenManager));
        return target.proxy(DocumentsService.class);
    }

}
