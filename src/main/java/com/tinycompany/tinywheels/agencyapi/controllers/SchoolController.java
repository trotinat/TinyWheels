package com.tinycompany.tinywheels.agencyapi.controllers;

import com.tinycompany.tinywheels.agencyapi.models.School;
import com.tinycompany.tinywheels.agencyapi.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/School")
public class SchoolController {

@Autowired
SchoolRepository schoolRepository;

    // Create operation
    @PostMapping
    public ResponseEntity<School> createSchool(@RequestBody School school) {
        School savedSchool = schoolRepository.save(school);
        return new ResponseEntity<>(savedSchool, HttpStatus.CREATED);
    }

    // FindById
    @GetMapping("/{id}")
    public ResponseEntity<School> getSchool(@PathVariable Long id) {
        Optional<School> school = schoolRepository.findById(id);
        if (school.isPresent()) {
            return new ResponseEntity<>(school.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // FindAll
    @GetMapping
    public ResponseEntity<List<School>> getAllSchool(){
        List<School> school = schoolRepository.findAll();
        return ResponseEntity.ok(school);
    }

    // Update operation
    @PutMapping("/{id}")
    public ResponseEntity<School> updateSchool(@PathVariable Long id, @RequestBody School school) {
        Optional<School> existingSchool = schoolRepository.findById(id);
        if (existingSchool.isPresent()) {
            school.setId(Math.toIntExact(id));
            School savedSchool = schoolRepository.save(school);
            return new ResponseEntity<>(savedSchool, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete operation
    @DeleteMapping("/{id}")
    public ResponseEntity<School> deleteSchool(@PathVariable Long id) {
        Optional<School> school = schoolRepository.findById(id);
        if (school.isPresent()) {
            schoolRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
