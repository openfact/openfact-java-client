package org.openfact.client;

import org.junit.Assert;
import org.junit.Test;
import org.openfact.client.services.DocumentsService;

import static org.junit.Assert.*;

public class OpenfactClientFactoryTest {

    @Test
    public void getDocumentsService() {
        DocumentsService service = OpenfactClientFactory.getDocumentsService("http://miserver", "miToken");
        Assert.assertNotNull(service);
    }
}