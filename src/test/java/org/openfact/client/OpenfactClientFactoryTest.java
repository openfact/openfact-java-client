package org.openfact.client;

import org.junit.Assert;
import org.junit.Test;
import org.openfact.client.oauth.TokenManager;
import org.openfact.client.services.DocumentsService;
import org.openfact.client.services.representations.idm.DocumentRepresentation;

import javax.ws.rs.core.Response;

import static org.junit.Assert.*;

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