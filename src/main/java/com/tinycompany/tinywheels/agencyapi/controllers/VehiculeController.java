package com.tinycompany.tinywheels.agencyapi.controllers;


import com.tinycompany.tinywheels.agencyapi.models.Vehicule;
import com.tinycompany.tinywheels.agencyapi.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Vehicule")
public class VehiculeController {

    @Autowired
    VehiculeRepository vehiculeRepository;

    // Create operation
    @PostMapping
    public ResponseEntity<Vehicule> createVehicule(@RequestBody Vehicule vehicule) {
        Vehicule savedVehicule = vehiculeRepository.save(vehicule);
        return new ResponseEntity<>(savedVehicule, HttpStatus.CREATED);
    }

    // FindById
    @GetMapping("/{id}")
    public ResponseEntity<Vehicule> getVehicule(@PathVariable Long id) {
        Optional<Vehicule> vehicule = vehiculeRepository.findById(id);
        if (vehicule.isPresent()) {
            return new ResponseEntity<>(vehicule.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // FindAll
    @GetMapping
    public ResponseEntity<List<Vehicule>> getAllVehicule(){
        List<Vehicule> vehicule = vehiculeRepository.findAll();
        return ResponseEntity.ok(vehicule);
    }

    // Update operation
    @PutMapping("/{id}")
    public ResponseEntity<Vehicule> updateVehicule(@PathVariable Long id, @RequestBody Vehicule vehicule) {
        Optional<Vehicule> existingVehicule = vehiculeRepository.findById(id);
        if (existingVehicule.isPresent()) {
            vehicule.setId(Math.toIntExact(id));
            Vehicule savedVehicule = vehiculeRepository.save(vehicule);
            return new ResponseEntity<>(savedVehicule, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete operation
    @DeleteMapping("/{id}")
    public ResponseEntity<Vehicule> deleteVehicule(@PathVariable Long id) {
        Optional<Vehicule> vehicule = vehiculeRepository.findById(id);
        if (vehicule.isPresent()) {
            vehiculeRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
