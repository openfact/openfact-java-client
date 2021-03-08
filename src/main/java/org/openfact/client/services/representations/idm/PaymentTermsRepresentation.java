package org.openfact.client.services.representations.idm;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentTermsRepresentation {
    protected String id;
    protected BigDecimal paymentPercent;
    protected BigDecimal amount;
    protected Date paymentDueDate;
    protected String paymentMeansId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Date getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(Date paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPaymentPercent() {
        return paymentPercent;
    }

    public void setPaymentPercent(BigDecimal paymentPercent) {
        this.paymentPercent = paymentPercent;
    }

    public String getPaymentMeansId() {
        return paymentMeansId;
    }

    public void setPaymentMeansId(String paymentMeansId) {
        this.paymentMeansId = paymentMeansId;
    }
}
