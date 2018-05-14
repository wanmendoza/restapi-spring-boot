package com.wanmendoza.restapi.models;

import javax.persistence.*;

@Entity
@Table(name = "detalle_factura")
public class InvoiceDetail {

    @Id
    @GeneratedValue
    @Column(name = "correlativo", nullable = false, length = 10)
    private Long detailCorrelative;

    @ManyToOne
    @JoinColumns ({
            @JoinColumn(name="numero_factura", referencedColumnName = "numero_factura"),
            @JoinColumn(name="serie_factura", referencedColumnName = "serie_factura")
    })
    private Invoice invoice;


    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Product product;

    @Column(name = "cantidad")
    private Integer quantity;

    @Column(name = "precio")
    private Float subTotal;

    public InvoiceDetail(Invoice invoice, Product product, Integer quantity, Float subTotal) {
        this.invoice = invoice;
        this.product = product;
        this.quantity = quantity;
        this.subTotal = subTotal;
    }

    public Long getDetailCorrelative() {
        return detailCorrelative;
    }

    public void setDetailCorrelative(Long detailCorrelative) {
        this.detailCorrelative = detailCorrelative;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Float subTotal) {
        this.subTotal = subTotal;
    }
}
