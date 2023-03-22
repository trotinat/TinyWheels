package com.tinycompany.tinywheels.agencyapi.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.PersistenceConstructor;

@Entity
@Table(name="vehicule")
public class Vehicule {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private int id;
   @Column(nullable = false)
   private String brand;
   @Column(nullable = false)
   private String model;
   @Column(nullable = false)
   private int year;
   @Column(nullable = false)
   private String type;
   @Column(nullable = false)
   private String status;


   @PersistenceConstructor
   public Vehicule( String brand, String model, int year, String type, String status) {
      this.brand = brand;
      this.model = model;
      this.year = year;
      this.type = type;
      this.status = status;
   }

   public Vehicule() {

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