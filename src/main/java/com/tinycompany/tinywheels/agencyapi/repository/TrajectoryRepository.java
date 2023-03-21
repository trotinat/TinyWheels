package com.tinycompany.tinywheels.agencyapi.repository;

import com.tinycompany.tinywheels.agencyapi.models.Trajectory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrajectoryRepository extends JpaRepository<Trajectory, Long> {
}