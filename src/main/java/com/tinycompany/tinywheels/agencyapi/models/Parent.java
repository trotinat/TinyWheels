package com.tinycompany.tinywheels.agencyapi.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.PersistenceConstructor;

@Entity
@Table(name="parent")
public class Parent {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private int id;
   private String first_name;
   @Column(nullable = false)
   private String last_name;
   @Column(nullable = false)
   private String phone_number;
   @Column(nullable = false)
   private String email;
   @Column(nullable = false)
   private int id_address;

   @PersistenceConstructor
   public Parent( String first_name, String last_name, String phone_number, String email, int id_address) {
      this.first_name = first_name;
      this.last_name = last_name;
      this.phone_number = phone_number;
      this.email = email;
      this.id_address = id_address;
   }

   public Parent() {

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

   public int getId_address() {
      return id_address;
   }

   public void setId_address(int id_address) {
      this.id_address = id_address;
   }
}