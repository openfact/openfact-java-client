package org.openfact.client.services.representations.idm;

import java.math.BigDecimal;

public class LineRepresentation {

    protected String unitCode;
    protected BigDecimal cantidad;
    protected String tipoDeIgv;
    protected BigDecimal valorUnitario;
    protected BigDecimal precioUnitario;
    protected BigDecimal descuento;
    protected BigDecimal subtotal;
    protected BigDecimal igv;
    protected BigDecimal total;
    protected String descripcion;
    protected String codigoProducto;
    protected String codigoSunat;

    protected BigDecimal descuento;
    protected BigDecimal valorIcbPer;
    protected Boolean icbPer;

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoDeIgv() {
        return tipoDeIgv;
    }

    public void setTipoDeIgv(String tipoDeIgv) {
        this.tipoDeIgv = tipoDeIgv;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getCodigoSunat() {
        return codigoSunat;
    }

    public void setCodigoSunat(String codigoSunat) {
        this.codigoSunat = codigoSunat;
    }

    public BigDecimal getValorIcbPer() {
        return valorIcbPer;
    }

    public void setValorIcbPer(BigDecimal valorIcbPer) {
        this.valorIcbPer = valorIcbPer;
    }

    public Boolean getIcbPer() {
        return icbPer;
    }

    public void setIcbPer(Boolean icbPer) {
        this.icbPer = icbPer;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }
}