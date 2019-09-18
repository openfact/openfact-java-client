package org.openfact.client;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.openfact.client.oauth.AccessTokenResponse;
import org.openfact.client.oauth.TokenManager;

import javax.ws.rs.core.Response;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TokenManagerTest {

    public static final String CLIENT_ID = "myClientId";
    public static final String SERVER_TOKEN_URL = "http://openfact.pe/myServerTokenUrl";
    public static final String REFRESH_TOKEN = "myRefreshToken";


    @Test
    public void shoudl_saveRefreshToken() {
        TokenManager tokenManager = new TokenManager(CLIENT_ID, SERVER_TOKEN_URL);
        Assert.assertNull(tokenManager.getAccessToken());

        tokenManager.setRefreshToken(REFRESH_TOKEN);

        Assert.assertNull(tokenManager.getAccessToken());
    }

    @Test
    public void getAccessTokenFromResponse_shouldReturnNull() {
        Response response = mock(Response.class);

        when(response.getStatusInfo()).thenReturn(Response.Status.FORBIDDEN);
        assertNull(TokenManager.getAccessTokenFromResponse(response));
        verify(response).getStatusInfo();
    }

    @Test
    public void getAccessTokenFromResponse_shouldReturnValue() {
        Response response = mock(Response.class);

        when(response.getStatusInfo()).thenReturn(Response.Status.OK);
        when(response.readEntity(String.class)).thenReturn("{\"access_token\": \"myAccessToken\", \"expires_in\": 300, \"refresh_expires_in\": 0, \"refresh_token\": \"myRefreshToken\", \"token_type\": \"bearer\", \"id_token\": \"myIdToken\", \"not-before-policy\": 1510703074, \"session_state\": \"mySessionState\"}");
        AccessTokenResponse accessToken = TokenManager.getAccessTokenFromResponse(response);
        verify(response, Mockito.atLeastOnce()).getStatusInfo();
        verify(response).readEntity(String.class);

        assertNotNull(accessToken);
        assertEquals("myAccessToken", accessToken.getToken());
        assertEquals(300, accessToken.getExpiresIn());
        assertEquals("myRefreshToken", accessToken.getRefreshToken());
        assertEquals("bearer", accessToken.getTokenType());
        assertEquals("myIdToken", accessToken.getIdToken());
        assertEquals(1510703074, accessToken.getNotBeforePolicy());
        assertEquals("mySessionState", accessToken.getSessionState());
    }

}