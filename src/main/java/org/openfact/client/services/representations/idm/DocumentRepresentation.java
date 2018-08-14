package org.openfact.client.services.representations.idm;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DocumentRepresentation {

    private String id;
    private String documentId;
    private String documentType;
    private Date createdTimestamp;
    private Date issueDate;

    private String documentCurrencyCode;
    private String customerRegistrationName;
    private String customerAssignedAccountId;
    private String customerElectronicMail;

    private boolean enabled;
    private boolean closed;
    private boolean summaryVoided;

    private Map<String, List<String>> attributes;
    private Set<String> requiredActions;

    private List<DocumentRepresentation> attachedDocumentsAsOrigin;
    private List<DocumentRepresentation> attachedDocumentsAsDestiny;

    private List<Map<String, String>> documentLines;

    private String xmlBase64;
    private String pdfBase64;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public String getCustomerRegistrationName() {
        return customerRegistrationName;
    }

    public void setCustomerRegistrationName(String customerRegistrationName) {
        this.customerRegistrationName = customerRegistrationName;
    }

    public String getCustomerAssignedAccountId() {
        return customerAssignedAccountId;
    }

    public void setCustomerAssignedAccountId(String customerAssignedAccountId) {
        this.customerAssignedAccountId = customerAssignedAccountId;
    }

    public String getCustomerElectronicMail() {
        return customerElectronicMail;
    }

    public void setCustomerElectronicMail(String customerElectronicMail) {
        this.customerElectronicMail = customerElectronicMail;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Map<String, List<String>> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, List<String>> attributes) {
        this.attributes = attributes;
    }

    public Set<String> getRequiredActions() {
        return requiredActions;
    }

    public void setRequiredActions(Set<String> requiredActions) {
        this.requiredActions = requiredActions;
    }

    public List<DocumentRepresentation> getAttachedDocumentsAsOrigin() {
        return attachedDocumentsAsOrigin;
    }

    public void setAttachedDocumentsAsOrigin(List<DocumentRepresentation> attachedDocumentsAsOrigin) {
        this.attachedDocumentsAsOrigin = attachedDocumentsAsOrigin;
    }

    public String getDocumentCurrencyCode() {
        return documentCurrencyCode;
    }

    public void setDocumentCurrencyCode(String documentCurrencyCode) {
        this.documentCurrencyCode = documentCurrencyCode;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public List<DocumentRepresentation> getAttachedDocumentsAsDestiny() {
        return attachedDocumentsAsDestiny;
    }

    public void setAttachedDocumentsAsDestiny(List<DocumentRepresentation> attachedDocumentsAsDestiny) {
        this.attachedDocumentsAsDestiny = attachedDocumentsAsDestiny;
    }

    public List<Map<String, String>> getDocumentLines() {
        return documentLines;
    }

    public void setDocumentLines(List<Map<String, String>> documentLines) {
        this.documentLines = documentLines;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean isSummaryVoided() {
        return summaryVoided;
    }

    public void setSummaryVoided(boolean summaryVoided) {
        this.summaryVoided = summaryVoided;
    }

    public String getXmlBase64() {
        return xmlBase64;
    }

    public void setXmlBase64(String xmlBase64) {
        this.xmlBase64 = xmlBase64;
    }

    public String getPdfBase64() {
        return pdfBase64;
    }

    public void setPdfBase64(String pdfBase64) {
        this.pdfBase64 = pdfBase64;
    }

}