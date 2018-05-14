package com.wanmendoza.restapi.models;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "id_cliente", nullable = false, length = 10)
    private Long id;

    @Column(name = "producto", nullable = true, length = 100)
    private String productName;

    @Column(name = "existencia_inicial")
    private Integer initialInventory;

    @Column(name = "existencia_actual")
    private Integer currentInventory;

    @Column(name = "precio_actual")
    private Float currentPrice;

    public Product() {
        super();
    }

    public Product(String productName, Integer initialInventory, Integer currentInventory, Float currentPrice) {
        this.productName = productName;
        this.initialInventory = initialInventory;
        this.currentInventory = currentInventory;
        this.currentPrice = currentPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getInitialInventory() {
        return initialInventory;
    }

    public void setInitialInventory(Integer initialInventory) {
        this.initialInventory = initialInventory;
    }

    public Integer getCurrentInventory() {
        return currentInventory;
    }

    public void setCurrentInventory(Integer currentInventory) {
        this.currentInventory = currentInventory;
    }

    public Float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Float currentPrice) {
        this.currentPrice = currentPrice;
    }
}
