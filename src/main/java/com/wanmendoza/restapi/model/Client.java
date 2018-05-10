package com.wanmendoza.restapi.model;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Client {

    @Id
    @GeneratedValue
    private Long id;
}
