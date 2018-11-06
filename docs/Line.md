
# Line

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unitCode** | **String** | Unidad de medida del producto o servicio (UN/ECE rec 20- Unit Of Measure). Si es nulo el valor por defecto será NIU |  [optional]
**cantidad** | [**BigDecimal**](BigDecimal.md) | Cantidad de unidades vendidas del producto o servicio | 
**tipoDeIgv** | [**TipoDeIgvEnum**](#TipoDeIgvEnum) | Código de tipo de IGV utilizado para este producto o servicio (Catalogo 07). Ejemplo: GravadoOperaciónOnerosa&#x3D;10 | 
**valorUnitario** | [**BigDecimal**](BigDecimal.md) | Precio del producto o servicio sin IGV | 
**precioUnitario** | [**BigDecimal**](BigDecimal.md) | Precio del producto o servicio con IGV | 
**subtotal** | [**BigDecimal**](BigDecimal.md) | Resultado de multiplicar cantidad*valorUnitario | 
**igv** | [**BigDecimal**](BigDecimal.md) | Impuestos a pagar por el presente producto o servicio | 
**total** | [**BigDecimal**](BigDecimal.md) | Resultado de multiplicar cantidad*precioUnitario | 
**descripcion** | **String** | Descripcion del producto o servicio | 


<a name="TipoDeIgvEnum"></a>
## Enum: TipoDeIgvEnum
Name | Value
---- | -----
_10 | &quot;10&quot;
_11 | &quot;11&quot;
_12 | &quot;12&quot;
_13 | &quot;13&quot;
_14 | &quot;14&quot;
_15 | &quot;15&quot;
_16 | &quot;16&quot;
_17 | &quot;17&quot;
_20 | &quot;20&quot;
_21 | &quot;21&quot;
_30 | &quot;30&quot;
_31 | &quot;31&quot;
_32 | &quot;32&quot;
_33 | &quot;33&quot;
_34 | &quot;34&quot;
_35 | &quot;35&quot;
_36 | &quot;36&quot;
_40 | &quot;40&quot;



