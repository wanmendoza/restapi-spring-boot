package com.wanmendoza.restapi.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class InvoicePK implements Serializable {
    @Column(name = "numero_factura")
    @GeneratedValue
    private Long invoiceNumber;

    @Column(name = "serie_factura")
    private String invoiceSerial;

    public InvoicePK() {
    }

    public InvoicePK(Long invoiceNumber, String invoiceSerial) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceSerial = invoiceSerial;
    }

    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceSerial() {
        return invoiceSerial;
    }

    public void setInvoiceSerial(String invoiceSerial) {
        this.invoiceSerial = invoiceSerial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvoicePK)) return false;
        InvoicePK that = (InvoicePK) o;
        return Objects.equals(getInvoiceNumber(), that.getInvoiceNumber()) &&
                Objects.equals(getInvoiceSerial(), that.getInvoiceSerial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInvoiceNumber(), getInvoiceSerial());
    }
}
