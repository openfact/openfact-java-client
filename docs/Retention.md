
# Retention

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entidadTipoDeDocumento** | **String** | Tipo de documento del cliente (Catálogo 06) - Campo: AdditionalAccountID. | 
**entidadNumeroDeDocumento** | **String** | Número de documento del cliente. Puede ser número de: DNI, RUC, etc. | 
**entidadDenominacion** | **String** | Nombre o Razón Social del cliente. | 
**entidadDireccion** | **String** | Dirección domiciliaria del cliente. |  [optional]
**entidadEmail** | **String** | Correo electrónico del cliente. |  [optional]
**serieDocumento** | **String** | Serie del comprobante. Debe de tener exactamente 4 dígitos. |  [optional]
**numeroDocumento** | **String** | Número del comprobante. Debe de tener mínimo:1 y máximo: 8 dígitos. |  [optional]
**monedaDocumento** | [**MonedaDocumentoEnum**](#MonedaDocumentoEnum) | Moneda en la que emite el comprobante (ISO 4217) - https://en.wikipedia.org/wiki/ISO_4217 | 
**fechaDeEmision** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de emisión del comprobante. Debe de estar en formato yyyy-MM-ddTHH:MM:SSZ |  [optional]
**codigoDocumento** | **String** | Regimen de percepcion/retencion Catalogo 22/23 | 
**tasaDocumento** | [**BigDecimal**](BigDecimal.md) | Valor porcentual del régimen de percepcion/retención. | 
**totalPago** | [**BigDecimal**](BigDecimal.md) | Monto total pagado/cobrado. | 
**totalDocumentoSunat** | [**BigDecimal**](BigDecimal.md) | Monto total retenido/percibido. | 
**enviarAutomaticamenteASunat** | **Boolean** | true: el comprobante se envia a la SUNAT. false: el comprobante no es enviado a la SUNAT y puede ser editado. |  [optional]
**enviarAutomaticamenteAlCliente** | **Boolean** | Si true: el comprobante se envia al correo especificado en el campo &#39;entidadEmail&#39;. |  [optional]
**observaciones** | **String** | Observaciones del comprobante. |  [optional]
**detalle** | [**List&lt;PerceptionRetentionLine&gt;**](PerceptionRetentionLine.md) |  |  [optional]


<a name="MonedaDocumentoEnum"></a>
## Enum: MonedaDocumentoEnum
Name | Value
---- | -----
PEN | &quot;PEN&quot;
USD | &quot;USD&quot;
EUR | &quot;EUR&quot;



