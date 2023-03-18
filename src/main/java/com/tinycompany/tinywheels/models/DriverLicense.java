package com.tinycompany.tinywheels.models;

import java.util.Date;

public class DriverLicense {
    private int id;
    private java.util.Date date_obtained;
    private String type;
    private int id_driver;

    public DriverLicense(int id, Date date_obtained, String type, int id_driver) {
        this.id = id;
        this.date_obtained = date_obtained;
        this.type = type;
        this.id_driver = id_driver;
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