package com.tinycompany.tinywheels.models;

public class Address {
   private int id;
   private String address_string;
   private double latitude;
   private double longitude;

   public Address(int id, String address_string, double latitude, double longitude) {
      this.id = id;
      this.address_string = address_string;
      this.latitude = latitude;
      this.longitude = longitude;
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