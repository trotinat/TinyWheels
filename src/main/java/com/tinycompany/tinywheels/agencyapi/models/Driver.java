package com.tinycompany.tinywheels.agencyapi.models;

import jakarta.persistence.*;
import java.util.Date;


@Entity
@DiscriminatorValue("driver")
@Table(name="driver")
public class Driver extends Personne {

   /*
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
   */
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private int id;
   @Column(name = "image_data")
   private byte[] imageData;
   @Column(nullable = false)
   private String license_type;
   @Column(nullable = false)
   private Date StartDate;
   @Column(nullable = false)
   private Date DateEmbauche;

   @Column(length = 5)
   private int rating;

   public Driver() {

   }

   public enum Status {
      Disponible,
      Not_Disponible,

   }
   @Enumerated(EnumType.STRING)
   private Status role;

   @OneToOne(mappedBy = "driver", cascade = CascadeType.ALL)
   private Vehicule vehicule;

}