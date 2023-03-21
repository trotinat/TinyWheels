package com.tinycompany.tinywheels.agencyapi.repository;

import com.tinycompany.tinywheels.agencyapi.models.DriverLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverLicenseRepository extends JpaRepository<DriverLicense, Long> {
}