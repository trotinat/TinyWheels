package com.tinycompany.tinywheels.models;

public class School {
   private int id;
   private String name;
   private int id_address;

   public School(int id, String name, int id_address) {
      this.id = id;
      this.name = name;
      this.id_address = id_address;
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