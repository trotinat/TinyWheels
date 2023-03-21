package com.tinycompany.tinywheels.agencyapi.repository;

import com.tinycompany.tinywheels.agencyapi.models.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
}