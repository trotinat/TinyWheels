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

   @Column(name = "image_data")
   private byte[] imageData;
   @Column(nullable = false)
   private String brand;
   @Column(nullable = false)
   private String model;
   @Column(nullable = false)
   private int year;
   @Column(nullable = false)
   private String type;


   public enum Status {
      Bon_Etat,
      Mauvaise_Etat,

   }
   @Enumerated(EnumType.STRING)
   private Driver.Status status;

   @OneToOne
   @JoinColumn(name = "driver_id")
   private Driver driver;

   public byte[] getImageData() {
      return imageData;
   }

   public void setImageData(byte[] imageData) {
      this.imageData = imageData;
   }

   public void setStatus(Driver.Status status) {
      this.status = status;
   }

   public Driver getDriver() {
      return driver;
   }

   public void setDriver(Driver driver) {
      this.driver = driver;
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

}