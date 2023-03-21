package com.tinycompany.tinywheels.agencyapi.repository;

import com.tinycompany.tinywheels.agencyapi.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}