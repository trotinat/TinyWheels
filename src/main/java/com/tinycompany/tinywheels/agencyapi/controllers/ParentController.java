package com.tinycompany.tinywheels.agencyapi.controllers;

import com.tinycompany.tinywheels.agencyapi.models.Parent;
import com.tinycompany.tinywheels.agencyapi.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Parent")
public class ParentController {

    @Autowired
    ParentRepository parentRepository;

    // Create operation
    @PostMapping
    public ResponseEntity<Parent> createParent(@RequestBody Parent parent) {
        Parent savedParent = parentRepository.save(parent);
        return new ResponseEntity<>(savedParent, HttpStatus.CREATED);
    }

    // FindById
    @GetMapping("/{id}")
    public ResponseEntity<Parent> getParent(@PathVariable Long id) {
        Optional<Parent> parent = parentRepository.findById(id);
        if (parent.isPresent()) {
            return new ResponseEntity<>(parent.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // FindAll
    @GetMapping
    public ResponseEntity<List<Parent>> getAllParent(){
        List<Parent> parent = parentRepository.findAll();
        return ResponseEntity.ok(parent);
    }

    // Update operation
    @PutMapping("/{id}")
    public ResponseEntity<Parent> updateParent(@PathVariable Long id, @RequestBody Parent parent) {
        Optional<Parent> existingParent = parentRepository.findById(id);
        if (existingParent.isPresent()) {
            parent.setId(Math.toIntExact(id));
            Parent savedParent = parentRepository.save(parent);
            return new ResponseEntity<>(savedParent, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete operation
    @DeleteMapping("/{id}")
    public ResponseEntity<Parent> deleteParent(@PathVariable Long id) {
        Optional<Parent> parent = parentRepository.findById(id);
        if (parent.isPresent()) {
            parentRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
