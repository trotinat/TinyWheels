package com.tinycompany.tinywheels.agencyapi.controllers;


import com.tinycompany.tinywheels.agencyapi.models.DriverLicense;
import com.tinycompany.tinywheels.agencyapi.repository.DriverLicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/DriverLicense")
public class DriverLicenseController {

    @Autowired
    DriverLicenseRepository driverLicenseRepository;

        // Create operation
        @PostMapping
        public ResponseEntity<DriverLicense> createDriverLicense(@RequestBody DriverLicense product) {
            DriverLicense saveddriverlicense = driverLicenseRepository.save(product);
            return new ResponseEntity<>(saveddriverlicense, HttpStatus.CREATED);
        }

        // FindById
        @GetMapping("/{id}")
        public ResponseEntity<DriverLicense> getDriverLicense(@PathVariable Long id) {
            Optional<DriverLicense> driverLicense = driverLicenseRepository.findById(id);
            if (driverLicense.isPresent()) {
                return new ResponseEntity<>(driverLicense.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

        // FindAll
        @GetMapping
        public ResponseEntity<List<DriverLicense>> getAllDriverLicense(){
            List<DriverLicense> driverLicense = driverLicenseRepository.findAll();
            return ResponseEntity.ok(driverLicense);
        }

        // Update operation
        @PutMapping("/{id}")
        public ResponseEntity<DriverLicense> updatedriverlicense(@PathVariable Long id, @RequestBody DriverLicense driverLicense) {
            Optional<DriverLicense> existingDriverLicense = driverLicenseRepository.findById(id);
            if (existingDriverLicense.isPresent()) {
                driverLicense.setId(Math.toIntExact(id));
                DriverLicense saveddriverlicense = driverLicenseRepository.save(driverLicense);
                return new ResponseEntity<>(saveddriverlicense, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

        // Delete operation
        @DeleteMapping("/{id}")
        public ResponseEntity<DriverLicense> deletedriverlicense(@PathVariable Long id) {
            Optional<DriverLicense> product = driverLicenseRepository.findById(id);
            if (product.isPresent()) {
                driverLicenseRepository.deleteById(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }


    }



