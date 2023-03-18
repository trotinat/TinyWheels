package com.tinycompany.tinywheels.models;

public class Vehicule {
   private int id;
   private String brand;
   private String model;
   private int year;
   private String type;
   private String status;

   public Vehicule(int id, String brand, String model, int year, String type, String status) {
      this.id = id;
      this.brand = brand;
      this.model = model;
      this.year = year;
      this.type = type;
      this.status = status;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getBrand() {
      return brand;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }
}