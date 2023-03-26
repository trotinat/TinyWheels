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
   private String street;
   @Column(nullable = false)
   private String suite;
   @Column(nullable = false)
   private String city;
   @Column(nullable = false)
   private String zipcode;

   @Column(nullable = false)
   private double latitude;

   @Column(nullable = false)
   private double longitude;


   public String getStreet() {
      return street;
   }

   public void setStreet(String street) {
      this.street = street;
   }

   public String getSuite() {
      return suite;
   }

   public void setSuite(String suite) {
      this.suite = suite;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getZipcode() {
      return zipcode;
   }

   public void setZipcode(String zipcode) {
      this.zipcode = zipcode;
   }

   public Address() {
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
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