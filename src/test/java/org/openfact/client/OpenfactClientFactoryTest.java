package org.openfact.client;

import org.junit.Assert;
import org.junit.Test;
import org.openfact.client.oauth.TokenManager;
import org.openfact.client.services.DocumentsService;

public class OpenfactClientFactoryTest {

    @Test
    public void test_shouldCreateTokenManager() {
        TokenManager tokenManager = OpenfactClientFactory.getTokenManager("myClientId", "myTokenUrl", "myOfflineToken");
        Assert.assertNotNull(tokenManager);
    }

    @Test
    public void test_shouldCreateOpenfactClient() {
        TokenManager tokenManager = OpenfactClientFactory.getTokenManager("myClientId", "http://myServerTokenUrl", "myRefreshToken");
        DocumentsService service = OpenfactClientFactory.getDocumentsService("http://myOpenfactServerUrl", tokenManager);
        Assert.assertNotNull(service);
    }

}