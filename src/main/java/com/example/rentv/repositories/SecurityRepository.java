package com.example.rentv.repositories;

import com.example.rentv.models.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Long> {
    Security findByEmail(String email);

}

