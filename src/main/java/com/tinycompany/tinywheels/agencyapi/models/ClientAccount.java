package com.tinycompany.tinywheels.agencyapi.models;


import jakarta.persistence.*;
import org.springframework.data.annotation.PersistenceConstructor;

@Entity
@Table(name="clientaccount")
public class ClientAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String type;

    @PersistenceConstructor
    public ClientAccount(String email, String password, String type) {
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public ClientAccount(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
