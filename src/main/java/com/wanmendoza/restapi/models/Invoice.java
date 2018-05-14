package com.wanmendoza.restapi.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "factura")
public class Invoice {

    @EmbeddedId
    private InvoicePK invoicePK;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    private Client client;

    @Column(name = "fecha")
    private Date invoiceDate;

    public Invoice(InvoicePK invoicePK, Client client, Date invoiceDate) {
        this.invoicePK = invoicePK;
        this.client = client;
        this.invoiceDate = invoiceDate;
    }

    public InvoicePK getInvoicePK() {
        return invoicePK;
    }

    public void setInvoicePK(InvoicePK invoicePK) {
        this.invoicePK = invoicePK;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
