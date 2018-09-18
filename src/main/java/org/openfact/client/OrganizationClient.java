package org.openfact.client;

import org.openfact.client.services.DocumentsService;
import org.openfact.client.services.representations.idm.*;

import javax.ws.rs.core.Response;

public class OrganizationClient {

    private final String organization;
    private final DocumentsService documentsService;

    public OrganizationClient(String organization, DocumentsService documentsService) {
        this.organization = organization;
        this.documentsService = documentsService;
    }

    public Response getDocumentById(String id) {
        return documentsService.getDocumentById(organization, id);
    }

    public DocumentResponseRepresentation getDocumentByIdAsEntity(String id) {
        Response response = getDocumentById(id);
        DocumentResponseRepresentation rep = response.readEntity(DocumentResponseRepresentation.class);
        response.close();
        return rep;
    }

    public Response getXml(String id) {
        return documentsService.getXml(organization, id);
    }

    public Response getPdf(String id) {
        return documentsService.getPdf(organization, id);
    }

    public Response sendToThirdParty(String id) {
        return documentsService.sendToThirdParty(organization, id);
    }

    public Response sendToCustomThirdParty(String id, ThirdPartyEmailRepresentation thirdParty) {
        return documentsService.sendToCustomThirdParty(organization, id, thirdParty);
    }

    public Response search(SearchCriteriaRepresentation criteria) {
        return documentsService.search(organization, criteria);
    }

    public Response getCdr(String id) {
        return documentsService.getCdr(organization, id);
    }

    public Response checkTicket(String id) {
        return documentsService.checkTicket(organization, id);
    }

    public Response createInvoice(DocumentRequestRepresentation invoice, boolean async) {
        return documentsService.createInvoice(organization, invoice, async);
    }

    public Response createInvoiceFromString(String invoice, boolean async) {
        return documentsService.createInvoiceFromString(organization, invoice, async);
    }

    public DocumentResponseRepresentation createInvoiceAndParseAsEntity(DocumentRequestRepresentation invoice, boolean async) {
        Response response = createInvoice(invoice, async);
        DocumentResponseRepresentation rep = response.readEntity(DocumentResponseRepresentation.class);
        response.close();
        return rep;
    }

    public Response updateInvoice(String id, DocumentRequestRepresentation invoice, boolean async) {
        return documentsService.updateInvoice(organization, id, invoice, async);
    }

    public Response updateInvoiceFromString(String id, String invoice, boolean async) {
        return documentsService.updateInvoiceFromString(organization, id, invoice, async);
    }

    public Response createCreditNote(DocumentRequestRepresentation creditNote, boolean async) {
        return documentsService.createCreditNote(organization, creditNote, async);
    }

    public Response createCreditNoteFromString(String creditNote, boolean async) {
        return documentsService.createCreditNoteFromString(organization, creditNote, async);
    }

    public DocumentResponseRepresentation createCreditNoteAndParseAsEntity(DocumentRequestRepresentation creditNote, boolean async) {
        Response response = createCreditNote(creditNote, async);
        DocumentResponseRepresentation rep = response.readEntity(DocumentResponseRepresentation.class);
        response.close();
        return rep;
    }

    public Response updateCreditNote(String id, DocumentRequestRepresentation creditNote, boolean async) {
        return documentsService.updateCreditNote(organization, id, creditNote, async);
    }

    public Response updateCreditNoteFromString(String id, String creditNote, boolean async) {
        return documentsService.updateCreditNoteFromString(organization, id, creditNote, async);
    }

    public Response createDebitNote(DocumentRequestRepresentation debitNote, boolean async) {
        return documentsService.createDebitNote(organization, debitNote, async);
    }

    public Response createDebitNoteFromString(String debitNote, boolean async) {
        return documentsService.createDebitNoteFromString(organization, debitNote, async);
    }

    public DocumentResponseRepresentation createDebitNoteAndParseAsEntity(DocumentRequestRepresentation debitNote, boolean async) {
        Response response = createDebitNote(debitNote, async);
        DocumentResponseRepresentation rep = response.readEntity(DocumentResponseRepresentation.class);
        response.close();
        return rep;
    }

    public Response updateDebitNote(String id, DocumentRequestRepresentation debitNote, boolean async) {
        return documentsService.updateDebitNote(organization, id, debitNote, async);
    }

    public Response updateDebitNoteFromString(String id, String debitNote, boolean async) {
        return documentsService.updateDebitNoteFromString(organization, id, debitNote, async);
    }

    public Response createPerception(DocumentoSunatRepresentation perception, boolean async) {
        return documentsService.createPerception(organization, perception, async);
    }

    public Response createPerceptionFromString(String perception, boolean async) {
        return documentsService.createPerceptionFromString(organization, perception, async);
    }

    public DocumentResponseRepresentation createPerceptionAndParseAsEntity(DocumentoSunatRepresentation perception, boolean async) {
        Response response = createPerception(perception, async);
        DocumentResponseRepresentation rep = response.readEntity(DocumentResponseRepresentation.class);
        response.close();
        return rep;
    }

    public Response updatePerception(String id, DocumentoSunatRepresentation perception, boolean async) {
        return documentsService.updatePerception(organization, id, perception, async);
    }

    public Response updatePerceptionFromString(String id, String perception, boolean async) {
        return documentsService.updatePerceptionFromString(organization, id, perception, async);
    }

    public Response createRetention(DocumentoSunatRepresentation retention, boolean async) {
        return documentsService.createRetention(organization, retention, async);
    }

    public Response createRetentionFromString(String retention, boolean async) {
        return documentsService.createRetentionFromString(organization, retention, async);
    }

    public DocumentResponseRepresentation createRetentionAndParseAsEntity(DocumentoSunatRepresentation perception, boolean async) {
        Response response = createRetention(perception, async);
        DocumentResponseRepresentation rep = response.readEntity(DocumentResponseRepresentation.class);
        response.close();
        return rep;
    }

    public Response updateRetention(String id, DocumentoSunatRepresentation retention, boolean async) {
        return documentsService.updateRetention(organization, id, retention, async);
    }

    public Response updateRetentionFromString(String id, String retention, boolean async) {
        return documentsService.updateRetentionFromString(organization, id, retention, async);
    }

    public Response createVoidedDocument(VoidedRepresentation voidedDocument, boolean async) {
        return documentsService.createVoidedDocument(organization, voidedDocument, async);
    }

    public DocumentResponseRepresentation createVoidedDocumentAndParseAsEntity(VoidedRepresentation voidedDocument, boolean async) {
        Response response = createVoidedDocument(voidedDocument, async);
        DocumentResponseRepresentation rep = response.readEntity(DocumentResponseRepresentation.class);
        response.close();
        return rep;
    }

    public Response createVoidedDocumentFromString(String voidedDocument, boolean async) {
        return documentsService.createVoidedDocumentFromString(organization, voidedDocument, async);
    }

    public Response updateVoidedDocument(String id, VoidedRepresentation voidedDocument, boolean async) {
        return documentsService.updateVoidedDocument(organization, id, voidedDocument, async);
    }

    public Response updateVoidedDocumentFromString(String id, String voidedDocument, boolean async) {
        return documentsService.updateVoidedDocumentFromString(organization, id, voidedDocument, async);
    }

}
