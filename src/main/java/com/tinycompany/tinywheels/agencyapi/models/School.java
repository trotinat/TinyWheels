package com.tinycompany.tinywheels.agencyapi.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.PersistenceConstructor;

@Entity
@Table(name="school")
public class School {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private int id;
   @Column(nullable = false)
   private String name;
   @Column(nullable = false)
   private int id_address;

   @PersistenceConstructor
   public School( String name, int id_address) {
      this.name = name;
      this.id_address = id_address;
   }

   public School() {

   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getId_address() {
      return id_address;
   }

   public void setId_address(int id_address) {
      this.id_address = id_address;
   }
}