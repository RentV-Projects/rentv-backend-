package com.example.rentv.repositories;


import com.example.rentv.models.AdvertisementTier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisementTierRepository extends JpaRepository<AdvertisementTier, Long> {
}


