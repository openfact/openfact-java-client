# ComprobantesApi

All URIs are relative to *https://openfactv2-openfact-development.apps.console.sistcoop.org:83/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCreditNote**](ComprobantesApi.md#createCreditNote) | **POST** /admin/organizations/{organization}/sunat/documents/credit-notes | Crear Nota de Crédito
[**createDebitNote**](ComprobantesApi.md#createDebitNote) | **POST** /admin/organizations/{organization}/sunat/documents/debit-notes | Crear Nota de Débito
[**createInvoice**](ComprobantesApi.md#createInvoice) | **POST** /admin/organizations/{organization}/sunat/documents/invoices | Crear boleta/factura
[**createPerception**](ComprobantesApi.md#createPerception) | **POST** /admin/organizations/{organization}/sunat/documents/perceptions | Crear Percepción
[**createRetention**](ComprobantesApi.md#createRetention) | **POST** /admin/organizations/{organization}/sunat/documents/retentions | Crear Retención
[**createVoidedDocument**](ComprobantesApi.md#createVoidedDocument) | **POST** /admin/organizations/{organization}/sunat/documents/voided-documents | Crear VoidedDocument
[**getCdr**](ComprobantesApi.md#getCdr) | **GET** /admin/organizations/{organization}/sunat/documents/{id}/cdr | 
[**getDocumentById**](ComprobantesApi.md#getDocumentById) | **GET** /admin/organizations/{organization}/documents/{id} | Obtener comprobante


<a name="createCreditNote"></a>
# **createCreditNote**
> DocumentResponseRepresentation createCreditNote(organization, body, async)

Crear Nota de Crédito

Crea una Nota de Crédito y retorna el comprobante creado

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ComprobantesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: keycloak
ApiKeyAuth keycloak = (ApiKeyAuth) defaultClient.getAuthentication("keycloak");
keycloak.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//keycloak.setApiKeyPrefix("Token");

ComprobantesApi apiInstance = new ComprobantesApi();
String organization = "organization_example"; // String | Nombre de la organización
CreditNote body = new CreditNote(); // CreditNote | Cuerpo del comprobante
Boolean async = true; // Boolean | Tipo de operación
try {
    DocumentResponseRepresentation result = apiInstance.createCreditNote(organization, body, async);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComprobantesApi#createCreditNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| Nombre de la organización |
 **body** | [**CreditNote**](CreditNote.md)| Cuerpo del comprobante |
 **async** | **Boolean**| Tipo de operación | [optional] [default to true]

### Return type

[**DocumentResponseRepresentation**](DocumentResponseRepresentation.md)

### Authorization

[keycloak](../README.md#keycloak)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDebitNote"></a>
# **createDebitNote**
> DocumentResponseRepresentation createDebitNote(organization, body, async)

Crear Nota de Débito

Crea una Nota de Débito y retorna el comprobante creado

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ComprobantesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: keycloak
ApiKeyAuth keycloak = (ApiKeyAuth) defaultClient.getAuthentication("keycloak");
keycloak.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//keycloak.setApiKeyPrefix("Token");

ComprobantesApi apiInstance = new ComprobantesApi();
String organization = "organization_example"; // String | Nombre de la organización
DebitNote body = new DebitNote(); // DebitNote | Cuerpo del comprobante
Boolean async = true; // Boolean | Tipo de operación
try {
    DocumentResponseRepresentation result = apiInstance.createDebitNote(organization, body, async);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComprobantesApi#createDebitNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| Nombre de la organización |
 **body** | [**DebitNote**](DebitNote.md)| Cuerpo del comprobante |
 **async** | **Boolean**| Tipo de operación | [optional] [default to true]

### Return type

[**DocumentResponseRepresentation**](DocumentResponseRepresentation.md)

### Authorization

[keycloak](../README.md#keycloak)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createInvoice"></a>
# **createInvoice**
> DocumentResponseRepresentation createInvoice(organization, body, async)

Crear boleta/factura

Crea una boleta/factura y retorna el comprobante creado

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ComprobantesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: keycloak
ApiKeyAuth keycloak = (ApiKeyAuth) defaultClient.getAuthentication("keycloak");
keycloak.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//keycloak.setApiKeyPrefix("Token");

ComprobantesApi apiInstance = new ComprobantesApi();
String organization = "organization_example"; // String | Nombre de la organización
Invoice body = new Invoice(); // Invoice | Cuerpo del comprobante
Boolean async = true; // Boolean | Tipo de operación
try {
    DocumentResponseRepresentation result = apiInstance.createInvoice(organization, body, async);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComprobantesApi#createInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| Nombre de la organización |
 **body** | [**Invoice**](Invoice.md)| Cuerpo del comprobante |
 **async** | **Boolean**| Tipo de operación | [optional] [default to true]

### Return type

[**DocumentResponseRepresentation**](DocumentResponseRepresentation.md)

### Authorization

[keycloak](../README.md#keycloak)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPerception"></a>
# **createPerception**
> DocumentResponseRepresentation createPerception(organization, body, async)

Crear Percepción

Crea una Percepción y retorna el comprobante creado

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ComprobantesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: keycloak
ApiKeyAuth keycloak = (ApiKeyAuth) defaultClient.getAuthentication("keycloak");
keycloak.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//keycloak.setApiKeyPrefix("Token");

ComprobantesApi apiInstance = new ComprobantesApi();
String organization = "organization_example"; // String | Nombre de la organización
Perception body = new Perception(); // Perception | Cuerpo del comprobante
Boolean async = true; // Boolean | Tipo de operación
try {
    DocumentResponseRepresentation result = apiInstance.createPerception(organization, body, async);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComprobantesApi#createPerception");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| Nombre de la organización |
 **body** | [**Perception**](Perception.md)| Cuerpo del comprobante |
 **async** | **Boolean**| Tipo de operación | [optional] [default to true]

### Return type

[**DocumentResponseRepresentation**](DocumentResponseRepresentation.md)

### Authorization

[keycloak](../README.md#keycloak)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRetention"></a>
# **createRetention**
> DocumentResponseRepresentation createRetention(organization, body, async)

Crear Retención

Crea una Retención y retorna el comprobante creado

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ComprobantesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: keycloak
ApiKeyAuth keycloak = (ApiKeyAuth) defaultClient.getAuthentication("keycloak");
keycloak.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//keycloak.setApiKeyPrefix("Token");

ComprobantesApi apiInstance = new ComprobantesApi();
String organization = "organization_example"; // String | Nombre de la organización
Retention body = new Retention(); // Retention | Cuerpo del comprobante
Boolean async = true; // Boolean | Tipo de operación
try {
    DocumentResponseRepresentation result = apiInstance.createRetention(organization, body, async);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComprobantesApi#createRetention");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| Nombre de la organización |
 **body** | [**Retention**](Retention.md)| Cuerpo del comprobante |
 **async** | **Boolean**| Tipo de operación | [optional] [default to true]

### Return type

[**DocumentResponseRepresentation**](DocumentResponseRepresentation.md)

### Authorization

[keycloak](../README.md#keycloak)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createVoidedDocument"></a>
# **createVoidedDocument**
> DocumentResponseRepresentation createVoidedDocument(organization, body, async)

Crear VoidedDocument

Crea una VoidedDocument y retorna el comprobante creado

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ComprobantesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: keycloak
ApiKeyAuth keycloak = (ApiKeyAuth) defaultClient.getAuthentication("keycloak");
keycloak.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//keycloak.setApiKeyPrefix("Token");

ComprobantesApi apiInstance = new ComprobantesApi();
String organization = "organization_example"; // String | Nombre de la organización
VoidedDocument body = new VoidedDocument(); // VoidedDocument | Cuerpo del comprobante
Boolean async = true; // Boolean | Tipo de operación
try {
    DocumentResponseRepresentation result = apiInstance.createVoidedDocument(organization, body, async);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComprobantesApi#createVoidedDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| Nombre de la organización |
 **body** | [**VoidedDocument**](VoidedDocument.md)| Cuerpo del comprobante |
 **async** | **Boolean**| Tipo de operación | [optional] [default to true]

### Return type

[**DocumentResponseRepresentation**](DocumentResponseRepresentation.md)

### Authorization

[keycloak](../README.md#keycloak)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCdr"></a>
# **getCdr**
> getCdr(organization, id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ComprobantesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: keycloak
ApiKeyAuth keycloak = (ApiKeyAuth) defaultClient.getAuthentication("keycloak");
keycloak.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//keycloak.setApiKeyPrefix("Token");

ComprobantesApi apiInstance = new ComprobantesApi();
String organization = "organization_example"; // String | 
String id = "id_example"; // String | 
try {
    apiInstance.getCdr(organization, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ComprobantesApi#getCdr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[keycloak](../README.md#keycloak)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentById"></a>
# **getDocumentById**
> DocumentResponseRepresentation getDocumentById(organization, id)

Obtener comprobante

Retorna un comprobante de pago

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ComprobantesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: keycloak
ApiKeyAuth keycloak = (ApiKeyAuth) defaultClient.getAuthentication("keycloak");
keycloak.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//keycloak.setApiKeyPrefix("Token");

ComprobantesApi apiInstance = new ComprobantesApi();
String organization = "organization_example"; // String | 
String id = "id_example"; // String | 
try {
    DocumentResponseRepresentation result = apiInstance.getDocumentById(organization, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComprobantesApi#getDocumentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**|  |
 **id** | **String**|  |

### Return type

[**DocumentResponseRepresentation**](DocumentResponseRepresentation.md)

### Authorization

[keycloak](../README.md#keycloak)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

