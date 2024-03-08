package com.example.rentv.repositories;

import com.example.rentv.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByProfileNameOrSecurityEmail(String usernameOrEmail, String usernameOrEmail1);
    User findBySecurityId(Long securityId);

    boolean existsBySecurityEmail(String email);
}

