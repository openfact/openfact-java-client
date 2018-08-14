package org.openfact.client.services;

import org.openfact.client.services.representations.idm.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/admin/organizations")
@Consumes(MediaType.APPLICATION_JSON)
public interface DocumentsService {

    @GET
    @Path("/{organizationName}/documents/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response getDocumentById(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id
    );

    @GET
    @Path("/{organizationName}/documents/{id}/representation/xml")
    @Produces(MediaType.APPLICATION_JSON)
    Response getXml(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id
    );

    @GET
    @Path("/{organizationName}/documents/{id}/report")
    @Produces(MediaType.APPLICATION_JSON)
    Response getPdf(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id
    );

    @POST
    @Path("/{organizationName}/documents/{id}/send-to-third-party")
    @Produces(MediaType.APPLICATION_JSON)
    Response sendToThirdParty(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id
    );

    @POST
    @Path("/{organizationName}/documents/{id}/send-to-third-party-by-email")
    @Produces(MediaType.APPLICATION_JSON)
    Response sendToCustomThirdParty(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id,
            ThirdPartyEmailRepresentation thirdParty
    );

    @POST
    @Path("/{organizationName}/documents/search")
    @Produces(MediaType.APPLICATION_JSON)
    Response search(
            @PathParam("organizationName") String organizationName,
            SearchCriteriaRepresentation criteria
    );

    /*
     * Sunat
     */

    @GET
    @Path("/{organizationName}/sunat/documents/{id}/cdr")
    @Produces(MediaType.APPLICATION_JSON)
    Response getCdr(
            @PathParam("organizationName") String organizationName,
            @QueryParam("id") String id
    );

    @GET
    @Path("/{organizationName}/sunat/documents/{id}/check-ticket")
    @Produces(MediaType.APPLICATION_JSON)
    Response checkTicket(
            @PathParam("organizationName") String organizationName,
            @QueryParam("id") String id
    );

    /*
     * Invoices
     */

    @POST
    @Path("/{organizationName}/sunat/documents/invoices")
    @Produces(MediaType.APPLICATION_JSON)
    Response createInvoice(
            @PathParam("organizationName") String organizationName,
            DocumentRepresentation invoice,
            @QueryParam("async") boolean async
    );

    @POST
    @Path("/{organizationName}/sunat/documents/invoices")
    @Produces(MediaType.APPLICATION_JSON)
    Response createInvoiceFromString(
            @PathParam("organizationName") String organizationName,
            String invoice,
            @QueryParam("async") boolean async
    );

    @PUT
    @Path("/{organizationName}/sunat/documents/invoices/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response updateInvoice(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id,
            DocumentRepresentation invoice,
            @QueryParam("async") boolean async
    );

    @PUT
    @Path("/{organizationName}/sunat/documents/invoices/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response updateInvoiceFromString(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id, String invoice,
            @QueryParam("async") boolean async
    );


    /*
     * Credit Notes
     */

    @POST
    @Path("/{organizationName}/sunat/documents/credit-notes")
    @Produces(MediaType.APPLICATION_JSON)
    Response createCreditNote(
            @PathParam("organizationName") String organizationName,
            DocumentRepresentation creditNote,
            @QueryParam("async") boolean async
    );

    @POST
    @Path("/{organizationName}/sunat/documents/credit-notes")
    @Produces(MediaType.APPLICATION_JSON)
    Response createCreditNoteFromString(
            @PathParam("organizationName") String organizationName,
            String creditNote,
            @QueryParam("async") boolean async
    );

    @PUT
    @Path("/{organizationName}/sunat/documents/credit-notes/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response updateCreditNote(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id,
            DocumentRepresentation creditNote,
            @QueryParam("async") boolean async
    );

    @PUT
    @Path("/{organizationName}/sunat/documents/credit-notes/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response updateCreditNoteFromString(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id, String creditNote,
            @QueryParam("async") boolean async
    );


    /*
     * Debit Notes
     */

    @POST
    @Path("/{organizationName}/sunat/documents/debit-notes")
    @Produces(MediaType.APPLICATION_JSON)
    Response createDebitNote(
            @PathParam("organizationName") String organizationName,
            DocumentRepresentation debitNote,
            @QueryParam("async") boolean async
    );

    @POST
    @Path("/{organizationName}/sunat/documents/debit-notes")
    @Produces(MediaType.APPLICATION_JSON)
    Response createDebitNoteFromString(
            @PathParam("organizationName") String organizationName,
            String debitNote,
            @QueryParam("async") boolean async
    );

    @PUT
    @Path("/{organizationName}/sunat/documents/debit-notes/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response updateDebitNote(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id,
            DocumentRepresentation debitNote,
            @QueryParam("async") boolean async
    );

    @PUT
    @Path("/{organizationName}/sunat/documents/debit-notes/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response updateDebitNoteFromString(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id, String debitNote,
            @QueryParam("async") boolean async
    );

    /*
     * Perceptions
     */

    @POST
    @Path("/{organizationName}/sunat/documents/perceptions")
    @Produces(MediaType.APPLICATION_JSON)
    Response createPerception(
            @PathParam("organizationName") String organizationName,
            DocumentoSunatRepresentation perception,
            @QueryParam("async") boolean async
    );

    @POST
    @Path("/{organizationName}/sunat/documents/perceptions")
    @Produces(MediaType.APPLICATION_JSON)
    Response createPerceptionFromString(
            @PathParam("organizationName") String organizationName,
            String perception,
            @QueryParam("async") boolean async
    );

    @PUT
    @Path("/{organizationName}/sunat/documents/perceptions/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response updatePerception(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id,
            DocumentoSunatRepresentation perception,
            @QueryParam("async") boolean async
    );

    @PUT
    @Path("/{organizationName}/sunat/documents/perceptions/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response updatePerceptionFromString(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id, String perception,
            @QueryParam("async") boolean async
    );

    /*
     * Retentions
     */

    @POST
    @Path("/{organizationName}/sunat/documents/retentions")
    @Produces(MediaType.APPLICATION_JSON)
    Response createRetention(
            @PathParam("organizationName") String organizationName,
            DocumentoSunatRepresentation retention,
            @QueryParam("async") boolean async
    );

    @POST
    @Path("/{organizationName}/sunat/documents/retentions")
    @Produces(MediaType.APPLICATION_JSON)
    Response createRetentionFromString(
            @PathParam("organizationName") String organizationName,
            String retention,
            @QueryParam("async") boolean async
    );

    @PUT
    @Path("/{organizationName}/sunat/documents/retentions/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response updateRetention(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id,
            DocumentoSunatRepresentation retention,
            @QueryParam("async") boolean async
    );

    @PUT
    @Path("/{organizationName}/sunat/documents/retentions/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response updateRetentionFromString(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id, String retention,
            @QueryParam("async") boolean async
    );

    /*
     * Voided Documents
     */

    @POST
    @Path("/{organizationName}/sunat/documents/voided-documents")
    @Produces(MediaType.APPLICATION_JSON)
    Response createVoidedDocument(
            @PathParam("organizationName") String organizationName,
            VoidedRepresentation voidedDocument,
            @QueryParam("async") boolean async
    );

    @POST
    @Path("/{organizationName}/sunat/documents/voided-documents")
    @Produces(MediaType.APPLICATION_JSON)
    Response createVoidedDocumentFromString(
            @PathParam("organizationName") String organizationName,
            String voidedDocument,
            @QueryParam("async") boolean async
    );

    @PUT
    @Path("/{organizationName}/sunat/documents/voided-documents/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response updateVoidedDocument(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id,
            VoidedRepresentation voidedDocument,
            @QueryParam("async") boolean async
    );

    @PUT
    @Path("/{organizationName}/sunat/documents/voided-documents/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Response updateVoidedDocumentFromString(
            @PathParam("organizationName") String organizationName,
            @PathParam("id") String id, String voidedDocument,
            @QueryParam("async") boolean async
    );

}
