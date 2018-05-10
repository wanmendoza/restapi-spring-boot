package com.wanmendoza.restapi.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "producto")
public class Product implements Serializable {

    private Long id;
    private int initialQuantity;
    private int currentQuantity;
    private Float currentPrice;
}
