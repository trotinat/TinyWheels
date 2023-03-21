package com.tinycompany.tinywheels.agencyapi.controllers;


import com.tinycompany.tinywheels.agencyapi.models.Trajectory;
import com.tinycompany.tinywheels.agencyapi.repository.TrajectoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Trajectory")
public class TrajectoryController {

    @Autowired
    TrajectoryRepository trajectoryRepository;

    // Create operation
    @PostMapping
    public ResponseEntity<Trajectory> createTrajectory(@RequestBody Trajectory trajectory) {
        Trajectory savedTrajectory = trajectoryRepository.save(trajectory);
        return new ResponseEntity<>(savedTrajectory, HttpStatus.CREATED);
    }

    // FindById
    @GetMapping("/{id}")
    public ResponseEntity<Trajectory> getTrajectory(@PathVariable Long id) {
        Optional<Trajectory> trajectory = trajectoryRepository.findById(id);
        if (trajectory.isPresent()) {
            return new ResponseEntity<>(trajectory.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // FindAll
    @GetMapping
    public ResponseEntity<List<Trajectory>> getAllTrajectory(){
        List<Trajectory> trajectory = trajectoryRepository.findAll();
        return ResponseEntity.ok(trajectory);
    }

    // Update operation
    @PutMapping("/{id}")
    public ResponseEntity<Trajectory> updateTrajectory(@PathVariable Long id, @RequestBody Trajectory trajectory) {
        Optional<Trajectory> existingTrajectory = trajectoryRepository.findById(id);
        if (existingTrajectory.isPresent()) {
            trajectory.setId(Math.toIntExact(id));
            Trajectory savedTrajectory = trajectoryRepository.save(trajectory);
            return new ResponseEntity<>(savedTrajectory, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete operation
    @DeleteMapping("/{id}")
    public ResponseEntity<Trajectory> deleteTrajectory(@PathVariable Long id) {
        Optional<Trajectory> trajectory = trajectoryRepository.findById(id);
        if (trajectory.isPresent()) {
            trajectoryRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
