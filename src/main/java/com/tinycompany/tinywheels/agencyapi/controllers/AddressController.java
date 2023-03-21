package com.tinycompany.tinywheels.agencyapi.controllers;

import com.tinycompany.tinywheels.agencyapi.models.Address;
import com.tinycompany.tinywheels.agencyapi.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/address")
public class AddressController {

@Autowired
AddressRepository addressRepository;

    // Create operation
    @PostMapping
    public ResponseEntity<Address> createAddress(@RequestBody Address product) {
        Address savedProduct = addressRepository.save(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    // FindById
    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddress(@PathVariable Long id) {
        Optional<Address> address = addressRepository.findById(id);
        if (address.isPresent()) {
            return new ResponseEntity<>(address.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // FindAll
    @GetMapping
    public ResponseEntity<List<Address>> getAllAddress(){
        List<Address> address = addressRepository.findAll();
        return ResponseEntity.ok(address);
    }

    // Update operation
    @PutMapping("/{id}")
    public ResponseEntity<Address> updateProduct(@PathVariable Long id, @RequestBody Address address) {
        Optional<Address> existingAddress = addressRepository.findById(id);
        if (existingAddress.isPresent()) {
            address.setId(Math.toIntExact(id));
            Address savedProduct = addressRepository.save(address);
            return new ResponseEntity<>(savedProduct, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete operation
    @DeleteMapping("/{id}")
    public ResponseEntity<Address> deleteProduct(@PathVariable Long id) {
        Optional<Address> product = addressRepository.findById(id);
        if (product.isPresent()) {
            addressRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
