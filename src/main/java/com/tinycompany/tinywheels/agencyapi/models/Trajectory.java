package com.tinycompany.tinywheels.agencyapi.models;

import java.util.Date;

public class Trajectory {
    private int id;
    private int id_start_address;
    private int id_destination_address;
    private int id_driver;
    private Date pickup_date;
    private int id_client_account;
    private String status;

    public Trajectory(int id, int id_start_address, int id_destination_address, int id_driver, Date pickup_date, int id_client_account, String status) {
        this.id = id;
        this.id_start_address = id_start_address;
        this.id_destination_address = id_destination_address;
        this.id_driver = id_driver;
        this.pickup_date = pickup_date;
        this.id_client_account = id_client_account;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_start_address() {
        return id_start_address;
    }

    public void setId_start_address(int id_start_address) {
        this.id_start_address = id_start_address;
    }

    public int getId_destination_address() {
        return id_destination_address;
    }

    public void setId_destination_address(int id_destination_address) {
        this.id_destination_address = id_destination_address;
    }

    public int getId_driver() {
        return id_driver;
    }

    public void setId_driver(int id_driver) {
        this.id_driver = id_driver;
    }

    public Date getPickup_date() {
        return pickup_date;
    }

    public void setPickup_date(Date pickup_date) {
        this.pickup_date = pickup_date;
    }

    public int getId_client_account() {
        return id_client_account;
    }

    public void setId_client_account(int id_client_account) {
        this.id_client_account = id_client_account;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
