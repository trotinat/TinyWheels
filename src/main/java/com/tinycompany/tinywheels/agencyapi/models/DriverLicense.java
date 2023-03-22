package com.tinycompany.tinywheels.agencyapi.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.PersistenceConstructor;

import java.util.Date;


@Entity
@Table(name="driverlicense")
public class DriverLicense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(nullable = false)
    private java.util.Date date_obtained;
    @Column(nullable = false)

    private String type;
    @Column(nullable = false)
    private int id_driver;


    @PersistenceConstructor
    public DriverLicense( Date date_obtained, String type, int id_driver) {
        this.date_obtained = date_obtained;
        this.type = type;
        this.id_driver = id_driver;
    }

    public DriverLicense() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_obtained() {
        return date_obtained;
    }

    public void setDate_obtained(Date date_obtained) {
        this.date_obtained = date_obtained;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId_driver() {
        return id_driver;
    }

    public void setId_driver(int id_driver) {
        this.id_driver = id_driver;
    }
}