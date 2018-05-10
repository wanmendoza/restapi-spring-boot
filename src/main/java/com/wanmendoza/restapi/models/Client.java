package com.wanmendoza.restapi.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cliente")
public class Client implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
}
