package org.openfact.client;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvoiceTest {

    @Test
    public void test() {
        Invoice invoice = new Invoice("algo");
        assertEquals("algo", invoice.getField());
    }

}