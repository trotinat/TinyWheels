package com.tinycompany.tinywheels.agencyapi.models;


import jakarta.persistence.*;
import org.springframework.data.annotation.PersistenceConstructor;

@Entity
@Table(name="address")
public class Address {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private int id;

   @Column(nullable = false)
   private String address_string;

   @Column(nullable = false)
   private double latitude;

   @Column(nullable = false)
   private double longitude;


   @PersistenceConstructor
   public Address(String address_string, double latitude, double longitude) {
      this.address_string = address_string;
      this.latitude = latitude;
      this.longitude = longitude;
   }

   public Address() {
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getAddress_string() {
      return address_string;
   }

   public void setAddress_string(String address_string) {
      this.address_string = address_string;
   }

   public double getLatitude() {
      return latitude;
   }

   public void setLatitude(double latitude) {
      this.latitude = latitude;
   }

   public double getLongitude() {
      return longitude;
   }

   public void setLongitude(double longitude) {
      this.longitude = longitude;
   }
}