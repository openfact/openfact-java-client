package org.openfact.client;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openfact.client.oauth.TokenManager;
import org.openfact.client.services.DocumentsService;
import org.openfact.client.services.representations.idm.*;

public class ComprobantesApiExample {

    public static void main(String[] args) {
        //String openfactUrl = "http://localhost:8080/api";// "https://openfactv2-openfact.b9ad.pro-us-east-1.openshiftapps.com/api";//"http://openfactv2-openfact-development.apps.console.sistcoop.org:83/api";
        String openfactUrl = "https://openfactv2-openfact.b9ad.pro-us-east-1.openshiftapps.com/api";//"http://openfactv2-openfact-development.apps.console.sistcoop.org:83/api";
        String tokenServerUrl = "https://sso-sso.b9ad.pro-us-east-1.openshiftapps.com/auth/realms/innpath/protocol/openid-connect/token";//"http://keycloak-keycloak-sso-development.apps.console.sistcoop.org:83/auth/realms/ahren";
        String refreshToken = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJjR1lKa0l3a3FMR1VJbkNzNzBhVFJndS1ua2dCZndOem9OQmVoeFZyNVpvIn0.eyJqdGkiOiI1ZTcyZjBmMC1jZTNjLTQxNmEtYWZlYi1hODdhMmFhMjMwYjEiLCJleHAiOjAsIm5iZiI6MCwiaWF0IjoxNTk0MTcyMjkzLCJpc3MiOiJodHRwczovL3Nzby1zc28uYjlhZC5wcm8tdXMtZWFzdC0xLm9wZW5zaGlmdGFwcHMuY29tL2F1dGgvcmVhbG1zL2lubnBhdGgiLCJhdWQiOiJvcGVuZmFjdC13ZWItY29uc29sZSIsInN1YiI6Ijc5NjUyMWE5LWY5YTEtNGQxNy1hNTYzLWY1YzM3YTczMDUwNyIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvcGVuZmFjdC13ZWItY29uc29sZSIsIm5vbmNlIjoiMjFjODJjZmEtMjFhOS00MDZjLTljOTMtYTMwYzYyMDA0MmFmIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiYmQwODc3MjUtYTMyYS00ZDU5LThkNjQtN2E0YTRhMjhkY2MzIiwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9yZ2FuaXphdGlvbi1tYW5hZ2VyIiwib2ZmbGluZV9hY2Nlc3MiLCJhZG1pbiIsIm9yZ2FuaXphdGlvbi11c2VyIiwidW1hX2F1dGhvcml6YXRpb24iLCJvcmdhbml6YXRpb24tYWNjb3VudGFudCJdfSwicmVzb3VyY2VfYWNjZXNzIjp7Im9wZW5mYWN0Ijp7InJvbGVzIjpbIm1hbmFnZS1ldmVudHMiLCJtYW5hZ2Utb3JnYW5pemF0aW9uIiwidmlldy1ldmVudHMiLCJ2aWV3LWRvY3VtZW50cyIsImNyZWF0ZS1vcmdhbml6YXRpb24iLCJtYW5hZ2UtZG9jdW1lbnRzIiwidmlldy1vcmdhbml6YXRpb24iXX0sImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoib3BlbmlkIHByb2ZpbGUgZW1haWwgb2ZmbGluZV9hY2Nlc3MifQ.ItzIri3ANdUzyyNHIN6CKmwLfIpLQMheVxOpAFG9cTwj65u4nkTjjbPosSSeOaR32eWO82esJpwIc_qI2qxgirr71VQiSyANwu3NleZchHtYmBmdRe1PXSma5g9A6q1NlnWdO8ZzYLmNSyWBEOJwAMhikpSTQV_txgsApAEeUz2VlZwmHoaz-OSeWzKChK1LbC9eeiIhS4cCpOXqE4BxjeI5xVPW_vU9Ps1UY2350eq4mw_lVNY292KrrGMz8BHupGV-moBNuAjL2zB1JH2WUrvgHfsfGsFOPui7O6XD-hH9CXdfquyGzmY3TQM9hz8upRbr64dKy_oykkFgyEid-g";
        //"eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJGSjg2R2NGM2pUYk5MT2NvNE52WmtVQ0lVbWZZQ3FvcXRPUWVNZmJoTmxFIn0.eyJqdGkiOiI3NzJmZDM1ZS00ZGNjLTRiYTItYWIwOS05M2JhMTdjZmYxM2IiLCJleHAiOjAsIm5iZiI6MCwiaWF0IjoxNTMzNzcwMzAwLCJpc3MiOiJodHRwOi8va2V5Y2xvYWsta2V5Y2xvYWstc3NvLWRldmVsb3BtZW50LmFwcHMuY29uc29sZS5zaXN0Y29vcC5vcmc6ODMvYXV0aC9yZWFsbXMvYWhyZW4iLCJhdWQiOiJvcGVuZmFjdC13ZWItY29uc29sZSIsInN1YiI6IjY5YTU1MjU2LTA5YzMtNGI0Yy04MjNlLTUzMGMzYjJiZmE5OSIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvcGVuZmFjdC13ZWItY29uc29sZSIsIm5vbmNlIjoiZWY2NmVlZjctOTU2YS00MTA2LTg5OTItYjdiNGQyNGZiNjEzIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiYTE2MGUyZGItY2RkMi00YzE1LTlmMmItYWJmZjY5OWZjMDUwIiwiY2xpZW50X3Nlc3Npb24iOiI2Y2IzOTlhYS1jNDU4LTQ4YzUtYjQzZi0zYmQ4Njk5YjMxZDUiLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOlsib3JnYW5pemF0aW9uLW1hbmFnZXIiLCJvZmZsaW5lX2FjY2VzcyIsImFkbWluIiwib3JnYW5pemF0aW9uLXVzZXIiLCJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7Im9wZW5mYWN0Ijp7InJvbGVzIjpbIm1hbmFnZS1ldmVudHMiLCJtYW5hZ2Utb3JnYW5pemF0aW9uIiwidmlldy1ldmVudHMiLCJ2aWV3LWRvY3VtZW50cyIsImNyZWF0ZS1vcmdhbml6YXRpb24iLCJtYW5hZ2UtZG9jdW1lbnRzIiwidmlldy1vcmdhbml6YXRpb24iXX0sImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX19.MwUj9a6cuf3aMSFLYRvUgpOFNKFjlG2zftyPA0ERhkWHkFAdCmMe_1_DfvAYuff9zLLBYJIFiVPTob7Hcpl-bOqtCvSHV9vbGZPhBwd7h469tkdRu0vP3_6e3C2XM63_StymaCHUjLUss0bHUiQbvYyNmQSbOIKPUH5EvVZzBec";

        TokenManager tokenManager = OpenfactClientFactory.getTokenManager("openfact-web-console", tokenServerUrl, refreshToken);
        //tokenManager.getAccessToken();
        DocumentsService service = OpenfactClientFactory.getDocumentsService(openfactUrl, tokenManager);
        OrganizationClient client = new OrganizationClient("miempresa", service);//ahren

        DocumentResponseRepresentation invoice = client.createInvoiceAndParseAsEntity(getInvoice(), true);
        System.out.println("Document created:" + invoice.getDocumentId());

        DocumentResponseRepresentation buildRequestVoided = null;
        buildRequestVoided = client.getDocumentByIdAsEntity(invoice.getId());
        System.out.println("Document status:" + buildRequestVoided.getStatus() + "- "+ new Date());
        while (buildRequestVoided.getStatus()==null){
            buildRequestVoided = client.getDocumentByIdAsEntity(invoice.getId());
            System.out.println("Document re-status:" + buildRequestVoided.getStatus() + " "+new Date());
        }
    }

    public static DocumentRequestRepresentation getInvoice() {
        DocumentRequestRepresentation invoice = new DocumentRequestRepresentation();

        invoice.setFechaDeEmision(new Date());

        invoice.setTipo("01"); // Tipo de Documento (Boleta/factura)
        invoice.setEntidadDenominacion("Juan Perez"); // Nombre del cliente
        invoice.setEntidadEmail("micorreo@gmail.com"); // Email del cliente
        invoice.setEntidadNumeroDeDocumento("10437664221"); // Numero de documento del cliente (RUC/DNI)
        invoice.setEntidadTipoDeDocumento("6"); // Tipo de Documento del cliente (RUC/DNI)
        invoice.setEnviarAutomaticamenteASunat(true);
        invoice.setEnviarAutomaticamenteAlCliente(false);
        invoice.setIgv(new BigDecimal(18)); // IGV Aplicado a la operacion expresada en porcentaje 18%
        invoice.setMoneda("PEN"); // Moneda nacional
        invoice.setObservaciones("Mis observaciones");

        invoice.setOperacionGratuita(false); // Si la operacion es gratuita
        invoice.setTotalGratuita(BigDecimal.ZERO);

        invoice.setTotalGravada(new BigDecimal(317.58));
        invoice.setTotalExonerada(BigDecimal.ZERO);
        invoice.setTotalInafecta(BigDecimal.ZERO);

        invoice.setTotal(new BigDecimal(374.74));
        invoice.setTotalIgv(new BigDecimal(57.16));
        invoice.setTotalIcbPer(new BigDecimal(0));
        invoice.setTotalOtrosCargos(BigDecimal.ZERO); // Otros cargos aplicados
        invoice.setDescuentoGlobal(new BigDecimal(21.92)); // Descuentos aplicados

        // Detalle de la factura
        List<LineRepresentation> lines = new ArrayList<>();
        LineRepresentation line1 = new LineRepresentation();
        LineRepresentation line2 = new LineRepresentation();

        line1.setCantidad(new BigDecimal(6));
        line1.setDescripcion("Carro Toyota ultimo modelo");
        line1.setCodigoProducto("CTUM010"); //Codigo del producto yo servicio
        //line1.setCodigoSunat("52151504"); //Codigo de producto segun la codificacion de la sunat
        line1.setTipoDeIgv("10"); // Codigo de operacion (Gravado - Operacion Onerosa)
        line1.setValorUnitario(new BigDecimal(36.53)); // Precio unitario sin igv
        line1.setIgv(new BigDecimal(35.50)); // Igv aplicado al item
        line1.setPrecioUnitario(new BigDecimal(43.1)); // Precio unitario con igv
        line1.setSubtotal(new BigDecimal(197.24)); // Subtotal sin igv
        line1.setTotal(new BigDecimal(258.6)); // Subtotal con igv
        //campo para el descuento
        line1.setDescuento(new BigDecimal(21.92));
        //inicio de nuevos campos
        line1.setIcbPer(false); // activar en true para especificar que el item tiene el impuesto a la bolsa
        line1.setValorIcbPer(new BigDecimal(0)); // valor del icbper (impuesto a la bolsa).
        //fin de nuevos campos
        lines.add(line1);

        line2.setCantidad(new BigDecimal(1));
        line2.setDescripcion("bolsa");
        line1.setCodigoProducto("LDFO025"); //Codigo del producto yo servicio
        line1.setCodigoSunat("51121703"); //Codigo de producto segun la codificacion de la sunat
        line2.setTipoDeIgv("10"); // Codigo de operacion (Gravado - Operacion Onerosa)
        line2.setValorUnitario(new BigDecimal(120.34)); // Precio unitario sin igv
        line2.setIgv(new BigDecimal(21.66)); // Igv aplicado al item
        line2.setPrecioUnitario(new BigDecimal(142)); // Precio unitario con igv
        line2.setSubtotal(new BigDecimal(120.34)); // Subtotal sin igv
        line2.setTotal(new BigDecimal(142)); // Subtotal con igv
        //campo para el descuento
        line1.setDescuento(new BigDecimal(0));
        //inicio de nuevos campos
        line2.setIcbPer(false); // activar en true para especificar que el item tiene el impuesto a la bolsa
        //line2.setValorIcbPer(new BigDecimal(0.1)); // valor del icbper (impuesto a la bolsa).line2.setIcbPer(true); // activar en true para especificar que el item tiene el impuesto a la bolsa
        line2.setValorIcbPer(new BigDecimal(0)); // valor del icbper (impuesto a la bolsa).
        //fin de nuevos campos
        lines.add(line2);
        invoice.setDetalle(lines);

        //agregar detracciones al comprobante electronico.
       /* DetractionRepresentation detraction = new DetractionRepresentation();
        detraction.setTypeDetraction("012");//catalogo de detracciones
        detraction.setAmountDetraction(new BigDecimal(96));
        detraction.setPercentDetraction(new BigDecimal(8));
        invoice.setDetraction(detraction);*/

        //opcion para pago al contado.
        //invoice.setCredito(false);

        // Cuotas de pago al credito
       /* invoice.setCredito(true);
        List<PaymentTermsRepresentation> terms = new ArrayList<>();
        PaymentTermsRepresentation term1 = new PaymentTermsRepresentation();
        PaymentTermsRepresentation term2 = new PaymentTermsRepresentation();

        term1.setAmount(new BigDecimal(650));
        term1.setPaymentDueDate(new Date());
        term1.setPaymentMeansId("Cuota001");
        terms.add(term1);

        term2.setAmount(new BigDecimal(550));
        term2.setPaymentDueDate(new Date());
        term2.setPaymentMeansId("Cuota002");
        terms.add(term2);
        invoice.setPaymentTerms(terms);*/

        return invoice;
    }
}