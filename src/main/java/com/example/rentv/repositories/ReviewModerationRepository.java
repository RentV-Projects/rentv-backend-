package com.example.rentv.repositories;

import com.example.rentv.models.ReviewModeration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewModerationRepository extends JpaRepository<ReviewModeration, Long> {
}

