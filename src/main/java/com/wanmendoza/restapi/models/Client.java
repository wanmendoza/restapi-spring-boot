package com.wanmendoza.restapi.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cliente")
public class Client implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_cliente", nullable = false, length = 10)
    private Long id;

    @Column(name = "nombre1", length = 60)
    private String firstName;

    @Column(name = "nombre2", length = 60)
    private String secondName;

    @Column(name = "apellido1", length = 60)
    private String lastName;

    @Column(name = "apellido2", length = 60)
    private String secondLastName;

    @Column(name = "sexo", length = 60)
    private String gender;

    @Column(name = "nit", length = 60)
    private String nit;

    public Client() {
        super();
    }

    public Client(String firstName, String secondName, String lastName, String secondLastName, String gender, String nit) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.gender = gender;
        this.nit = nit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
