package org.openfact.client.services.representations.idm;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DocumentRequestRepresentation {

    protected String id;
    protected String tipo;

    protected String serie;
    protected String numero;
    @NotNull
    protected String entidadNumeroDeDocumento;
    @NotNull
    protected String entidadTipoDeDocumento;
    @NotNull
    protected String entidadDenominacion;
    protected String entidadDireccion;
    protected String entidadEmail;

    @NotNull
    protected Date fechaDeEmision;
    protected Date fechaDeVencimiento;
    protected Date fechaDeReferencia;

    @NotNull
    protected String moneda;
    protected BigDecimal tipoDeCambio;
    @NotNull
    protected boolean operacionGratuita;

    @NotNull
    protected BigDecimal totalGravada;
    protected BigDecimal totalInafecta;
    protected BigDecimal totalExonerada;
    @NotNull
    protected BigDecimal totalIgv;
    protected BigDecimal totalGratuita;

    @NotNull
    protected BigDecimal igv;
    protected BigDecimal totalIcbPer;
    protected BigDecimal porcentajeDescuento;

    protected BigDecimal descuentoGlobal;
    protected BigDecimal totalOtrosCargos;
    @NotNull
    protected BigDecimal total;

    protected boolean detraccion;

    protected String observaciones;

    protected String documentoQueSeModifica;

    protected String tipoDeNotaDeCredito;
    protected String tipoDeNotaDeDebito;

    protected boolean enviarAutomaticamenteASunat;
    protected boolean enviarAutomaticamenteAlCliente;

    protected boolean cancelado;
    protected String codigoUnico;
    private List<LineRepresentation> detalle;
    private SunatDespatchAdviceRepresentation despatchAdvice;

    protected DetractionRepresentation detraction;
    protected boolean credito;
    private List<PaymentTermsRepresentation> paymentTerms;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEntidadNumeroDeDocumento() {
        return entidadNumeroDeDocumento;
    }

    public void setEntidadNumeroDeDocumento(String entidadNumeroDeDocumento) {
        this.entidadNumeroDeDocumento = entidadNumeroDeDocumento;
    }

    public String getEntidadTipoDeDocumento() {
        return entidadTipoDeDocumento;
    }

    public void setEntidadTipoDeDocumento(String entidadTipoDeDocumento) {
        this.entidadTipoDeDocumento = entidadTipoDeDocumento;
    }

    public String getEntidadDenominacion() {
        return entidadDenominacion;
    }

    public void setEntidadDenominacion(String entidadDenominacion) {
        this.entidadDenominacion = entidadDenominacion;
    }

    public String getEntidadDireccion() {
        return entidadDireccion;
    }

    public void setEntidadDireccion(String entidadDireccion) {
        this.entidadDireccion = entidadDireccion;
    }

    public String getEntidadEmail() {
        return entidadEmail;
    }

    public void setEntidadEmail(String entidadEmail) {
        this.entidadEmail = entidadEmail;
    }

    public Date getFechaDeEmision() {
        return fechaDeEmision;
    }

    public void setFechaDeEmision(Date fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(BigDecimal tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }

    public boolean isOperacionGratuita() {
        return operacionGratuita;
    }

    public void setOperacionGratuita(boolean operacionGratuita) {
        this.operacionGratuita = operacionGratuita;
    }

    public BigDecimal getTotalGravada() {
        return totalGravada;
    }

    public void setTotalGravada(BigDecimal totalGravada) {
        this.totalGravada = totalGravada;
    }

    public BigDecimal getTotalInafecta() {
        return totalInafecta;
    }

    public void setTotalInafecta(BigDecimal totalInafecta) {
        this.totalInafecta = totalInafecta;
    }

    public BigDecimal getTotalExonerada() {
        return totalExonerada;
    }

    public void setTotalExonerada(BigDecimal totalExonerada) {
        this.totalExonerada = totalExonerada;
    }

    public BigDecimal getTotalIgv() {
        return totalIgv;
    }

    public void setTotalIgv(BigDecimal totalIgv) {
        this.totalIgv = totalIgv;
    }

    public BigDecimal getTotalGratuita() {
        return totalGratuita;
    }

    public void setTotalGratuita(BigDecimal totalGratuita) {
        this.totalGratuita = totalGratuita;
    }

    public BigDecimal getDescuentoGlobal() {
        return descuentoGlobal;
    }

    public void setDescuentoGlobal(BigDecimal descuentoGlobal) {
        this.descuentoGlobal = descuentoGlobal;
    }

    public BigDecimal getTotalOtrosCargos() {
        return totalOtrosCargos;
    }

    public void setTotalOtrosCargos(BigDecimal totalOtrosCargos) {
        this.totalOtrosCargos = totalOtrosCargos;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public boolean isDetraccion() {
        return detraccion;
    }

    public void setDetraccion(boolean detraccion) {
        this.detraccion = detraccion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTipoDeNotaDeCredito() {
        return tipoDeNotaDeCredito;
    }

    public void setTipoDeNotaDeCredito(String tipoDeNotaDeCredito) {
        this.tipoDeNotaDeCredito = tipoDeNotaDeCredito;
    }

    public String getTipoDeNotaDeDebito() {
        return tipoDeNotaDeDebito;
    }

    public void setTipoDeNotaDeDebito(String tipoDeNotaDeDebito) {
        this.tipoDeNotaDeDebito = tipoDeNotaDeDebito;
    }

    public boolean isEnviarAutomaticamenteASunat() {
        return enviarAutomaticamenteASunat;
    }

    public void setEnviarAutomaticamenteASunat(boolean enviarAutomaticamenteASunat) {
        this.enviarAutomaticamenteASunat = enviarAutomaticamenteASunat;
    }

    public boolean isEnviarAutomaticamenteAlCliente() {
        return enviarAutomaticamenteAlCliente;
    }

    public void setEnviarAutomaticamenteAlCliente(boolean enviarAutomaticamenteAlCliente) {
        this.enviarAutomaticamenteAlCliente = enviarAutomaticamenteAlCliente;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public Date getFechaDeReferencia() {
        return fechaDeReferencia;
    }

    public void setFechaDeReferencia(Date fechaDeReferencia) {
        this.fechaDeReferencia = fechaDeReferencia;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public BigDecimal getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(BigDecimal porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public List<LineRepresentation> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<LineRepresentation> detalle) {
        this.detalle = detalle;
    }

    public String getDocumentoQueSeModifica() {
        return documentoQueSeModifica;
    }

    public void setDocumentoQueSeModifica(String documentoQueSeModifica) {
        this.documentoQueSeModifica = documentoQueSeModifica;
    }

    public SunatDespatchAdviceRepresentation getDespatchAdvice() {
        return despatchAdvice;
    }

    public void setDespatchAdvice(SunatDespatchAdviceRepresentation despatchAdvice) {
        this.despatchAdvice = despatchAdvice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getTotalIcbPer() {
        return totalIcbPer;
    }

    public void setTotalIcbPer(BigDecimal totalIcbPer) {
        this.totalIcbPer = totalIcbPer;
    }

    public DetractionRepresentation getDetraction() {
        return detraction;
    }

    public void setDetraction(DetractionRepresentation detraction) {
        this.detraction = detraction;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public List<PaymentTermsRepresentation> getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(List<PaymentTermsRepresentation> paymentTerms) {
        this.paymentTerms = paymentTerms;
    }
}