
# DocumentResponseRepresentation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**documentId** | **String** |  |  [optional]
**documentType** | **String** |  |  [optional]
**createdTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**issueDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**documentCurrencyCode** | **String** |  |  [optional]
**customerRegistrationName** | **String** |  |  [optional]
**customerAssignedAccountId** | **String** |  |  [optional]
**customerElectronicMail** | **String** |  |  [optional]
**status** | **String** |  |  [optional]
**statusCode** | **Integer** |  |  [optional]
**statusMessage** | **String** |  |  [optional]
**bajaEnProceso** | **Boolean** |  |  [optional]
**closed** | **Boolean** |  |  [optional]
**summaryVoided** | **Boolean** |  |  [optional]
**attributes** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) |  |  [optional]
**requiredActions** | **List&lt;String&gt;** |  |  [optional]
**attachedDocumentsAsOrigin** | [**List&lt;DocumentResponseRepresentation&gt;**](DocumentResponseRepresentation.md) |  |  [optional]
**attachedDocumentsAsDestiny** | [**List&lt;DocumentResponseRepresentation&gt;**](DocumentResponseRepresentation.md) |  |  [optional]
**documentLines** | [**List&lt;Map&lt;String, String&gt;&gt;**](Map.md) |  |  [optional]
**xmlBase64** | **String** |  |  [optional]
**pdfBase64** | **String** |  |  [optional]



