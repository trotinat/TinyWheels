package com.tinycompany.tinywheels.agencyapi.repository;

import com.tinycompany.tinywheels.agencyapi.models.ClientAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientAccountRepository extends JpaRepository<ClientAccount, Long> {
}