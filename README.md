# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ComprobantesApi;

import java.io.File;
import java.util.*;

public class ComprobantesApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://openfactv2-openfact-development.apps.console.sistcoop.org:83/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ComprobantesApi* | [**createCreditNote**](docs/ComprobantesApi.md#createCreditNote) | **POST** /admin/organizations/{organization}/sunat/documents/credit-notes | Crear Nota de Crédito
*ComprobantesApi* | [**createDebitNote**](docs/ComprobantesApi.md#createDebitNote) | **POST** /admin/organizations/{organization}/sunat/documents/debit-notes | Crear Nota de Débito
*ComprobantesApi* | [**createInvoice**](docs/ComprobantesApi.md#createInvoice) | **POST** /admin/organizations/{organization}/sunat/documents/invoices | Crear boleta/factura
*ComprobantesApi* | [**createPerception**](docs/ComprobantesApi.md#createPerception) | **POST** /admin/organizations/{organization}/sunat/documents/perceptions | Crear Percepción
*ComprobantesApi* | [**createRetention**](docs/ComprobantesApi.md#createRetention) | **POST** /admin/organizations/{organization}/sunat/documents/retentions | Crear Retención
*ComprobantesApi* | [**createVoidedDocument**](docs/ComprobantesApi.md#createVoidedDocument) | **POST** /admin/organizations/{organization}/sunat/documents/voided-documents | Crear VoidedDocument
*ComprobantesApi* | [**getCdr**](docs/ComprobantesApi.md#getCdr) | **GET** /admin/organizations/{organization}/sunat/documents/{id}/cdr | 
*ComprobantesApi* | [**getDocumentById**](docs/ComprobantesApi.md#getDocumentById) | **GET** /admin/organizations/{organization}/documents/{id} | Obtener comprobante


## Documentation for Models

 - [CreditNote](docs/CreditNote.md)
 - [DebitNote](docs/DebitNote.md)
 - [DespatchAdvice](docs/DespatchAdvice.md)
 - [DocumentResponseRepresentation](docs/DocumentResponseRepresentation.md)
 - [Invoice](docs/Invoice.md)
 - [Line](docs/Line.md)
 - [Perception](docs/Perception.md)
 - [PerceptionRetentionLine](docs/PerceptionRetentionLine.md)
 - [PostalAddress](docs/PostalAddress.md)
 - [Retention](docs/Retention.md)
 - [VoidedDocument](docs/VoidedDocument.md)
 - [VoidedDocumentLine](docs/VoidedDocumentLine.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### keycloak

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



