
# CreditNote

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tipo** | [**TipoEnum**](#TipoEnum) | Código de tipo de documento (Catalogo 01). Ejemplos: Boleta&#x3D;03, Factura&#x3D;01 | 
**serie** | **String** | Serie del comprobante. Debe de tener exactamente 4 dígitos. Si es boleta la serie debe empezar con la letra B y si es factura la serie debe empezar con la letra F. El sistema generará una serie automáticamente si la serie y número son nulos |  [optional]
**numero** | **String** | Número del comprobante. Debe de tener mínimo:1 y máximo: 8 dígitos. El sistema generará una serie automáticamente si la serie y número son nulos |  [optional]
**entidadNumeroDeDocumento** | **String** | Número de documento del cliente. Puede ser número de: DNI, RUC, etc. | 
**entidadTipoDeDocumento** | [**EntidadTipoDeDocumentoEnum**](#EntidadTipoDeDocumentoEnum) | Tipo de documento del cliente (Catálogo 06). Ejemplos: DNI&#x3D;1, RUC&#x3D;6 | 
**entidadDenominacion** | **String** | Nombre o Razón Social del cliente. | 
**entidadDireccion** | **String** | Dirección domiciliaria del cliente. |  [optional]
**entidadEmail** | **String** | Correo electrónico del cliente. |  [optional]
**fechaDeEmision** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de emisión del comprobante. Debe de estar en formato yyyy-MM-ddTHH:MM:SSZ |  [optional]
**moneda** | [**MonedaEnum**](#MonedaEnum) | Moneda en la que emite el comprobante (ISO 4217) - https://en.wikipedia.org/wiki/ISO_4217 | 
**tipoDeCambio** | [**BigDecimal**](BigDecimal.md) | Tipo de cambio de la moneda extranjera. Solo es usado en caso el comprobante es emitido en moneda extrajera. |  [optional]
**operacionGratuita** | **Boolean** | Si la operación es gratuita o no. Usado en caso de donaciones por ejemplo. |  [optional]
**totalGravada** | [**BigDecimal**](BigDecimal.md) | Total de operaciones gravadas. | 
**totalInafecta** | [**BigDecimal**](BigDecimal.md) | Total de operaciones inafectas. | 
**totalExonerada** | [**BigDecimal**](BigDecimal.md) | Total de operaciones exoneradas. | 
**totalGratuita** | [**BigDecimal**](BigDecimal.md) | Total de operaciones gratuitas. | 
**totalIgv** | [**BigDecimal**](BigDecimal.md) | Monto total de IGV. | 
**descuentoGlobal** | [**BigDecimal**](BigDecimal.md) | Descuento Global. |  [optional]
**totalOtrosCargos** | [**BigDecimal**](BigDecimal.md) | Otros Cargos. |  [optional]
**total** | [**BigDecimal**](BigDecimal.md) | Monto total del comprobante. | 
**observaciones** | **String** | Observaciones del comprobante. |  [optional]
**enviarAutomaticamenteASunat** | **Boolean** | true: el comprobante se envia a la SUNAT. false: el comprobante no es enviado a la SUNAT y puede ser editado. |  [optional]
**enviarAutomaticamenteAlCliente** | **Boolean** | Si true: el comprobante se envia al correo especificado en el campo &#39;entidadEmail&#39;. |  [optional]
**detalle** | [**List&lt;Line&gt;**](Line.md) | Lista de productos o servicios. |  [optional]
**documentoQueSeModifica** | **String** | Serie y número del comprobante al que se aplica la nota de crédito. |  [optional]
**tipoDeNotaDeCredito** | [**TipoDeNotaDeCreditoEnum**](#TipoDeNotaDeCreditoEnum) | Código del tipo de nota de crédito. Catalogo 09 |  [optional]


<a name="TipoEnum"></a>
## Enum: TipoEnum
Name | Value
---- | -----
_01 | &quot;01&quot;
_03 | &quot;03&quot;
_07 | &quot;07&quot;
_08 | &quot;08&quot;
_09 | &quot;09&quot;
_20 | &quot;20&quot;
_40 | &quot;40&quot;


<a name="EntidadTipoDeDocumentoEnum"></a>
## Enum: EntidadTipoDeDocumentoEnum
Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;
_4 | &quot;4&quot;
_6 | &quot;6&quot;
_7 | &quot;7&quot;
A | &quot;A&quot;


<a name="MonedaEnum"></a>
## Enum: MonedaEnum
Name | Value
---- | -----
PEN | &quot;PEN&quot;
USD | &quot;USD&quot;
EUR | &quot;EUR&quot;


<a name="TipoDeNotaDeCreditoEnum"></a>
## Enum: TipoDeNotaDeCreditoEnum
Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_03 | &quot;03&quot;
_04 | &quot;04&quot;
_05 | &quot;05&quot;
_06 | &quot;06&quot;
_07 | &quot;07&quot;



