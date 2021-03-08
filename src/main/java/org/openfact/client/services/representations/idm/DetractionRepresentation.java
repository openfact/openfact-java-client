package org.openfact.client.services.representations.idm;

import java.math.BigDecimal;

public class DetractionRepresentation {
    protected String typeDetraction;
    protected BigDecimal amountDetraction;
    protected BigDecimal percentDetraction;

    public BigDecimal getPercentDetraction() {
        return percentDetraction;
    }

    public void setPercentDetraction(BigDecimal percentDetraction) {
        this.percentDetraction = percentDetraction;
    }



    public BigDecimal getAmountDetraction() {
        return amountDetraction;
    }

    public void setAmountDetraction(BigDecimal amountDetraction) {
        this.amountDetraction = amountDetraction;
    }



    public String getTypeDetraction() {
        return typeDetraction;
    }

    public void setTypeDetraction(String typeDetraction) {
        this.typeDetraction = typeDetraction;
    }
}
