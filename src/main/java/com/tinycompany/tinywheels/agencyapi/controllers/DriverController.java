package com.tinycompany.tinywheels.agencyapi.controllers;

import com.tinycompany.tinywheels.agencyapi.models.Driver;
import com.tinycompany.tinywheels.agencyapi.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Driver")
public class DriverController {

    @Autowired
    DriverRepository driverRepository;

    // Create operation
    @PostMapping
    public ResponseEntity<Driver> createDriver(@RequestBody Driver product) {
        Driver savedProduct = driverRepository.save(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    // FindById
    @GetMapping("/{id}")
    public ResponseEntity<Driver> getDriver(@PathVariable Long id) {
        Optional<Driver> driver = driverRepository.findById(id);
        if (driver.isPresent()) {
            return new ResponseEntity<>(driver.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // FindAll
    @GetMapping
    public ResponseEntity<List<Driver>> getAllDriver(){
        List<Driver> driver = driverRepository.findAll();
        return ResponseEntity.ok(driver);
    }

    // Update operation
    @PutMapping("/{id}")
    public ResponseEntity<Driver> updateProduct(@PathVariable Long id, @RequestBody Driver driver) {
        Optional<Driver> existingDriver = driverRepository.findById(id);
        if (existingDriver.isPresent()) {
            driver.setId(Math.toIntExact(id));
            Driver savedProduct = driverRepository.save(driver);
            return new ResponseEntity<>(savedProduct, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete operation
    @DeleteMapping("/{id}")
    public ResponseEntity<Driver> deleteProduct(@PathVariable Long id) {
        Optional<Driver> product = driverRepository.findById(id);
        if (product.isPresent()) {
            driverRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
