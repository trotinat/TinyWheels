package com.tinycompany.tinywheels.agencyapi.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.PersistenceConstructor;


@Entity
@Table(name="driver")
public class Driver {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private int id;
   @Column(nullable = false)
   private String first_name;
   @Column(nullable = false)
   private String last_name;
   @Column(nullable = false)
   private String phone_number;
   @Column(nullable = false)
   private String email;
   @Column(nullable = false)
   private String status;

   public Driver() {
   }

   @PersistenceConstructor
   public Driver(String first_name, String last_name, String phone_number, String email, String status) {
      this.first_name = first_name;
      this.last_name = last_name;
      this.phone_number = phone_number;
      this.email = email;
      this.status = status;
   }




   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getFirst_name() {
      return first_name;
   }

   public void setFirst_name(String first_name) {
      this.first_name = first_name;
   }

   public String getLast_name() {
      return last_name;
   }

   public void setLast_name(String last_name) {
      this.last_name = last_name;
   }

   public String getPhone_number() {
      return phone_number;
   }

   public void setPhone_number(String phone_number) {
      this.phone_number = phone_number;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }
}