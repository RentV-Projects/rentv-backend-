package com.example.rentv.controllers;

import com.example.rentv.dtos.AdvertisementTierDto;
import com.example.rentv.services.AdvertisementTierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/advertisement-tiers")
public class AdvertisementTierController {

    @Autowired
    private AdvertisementTierService advertisementTierService;

    @PostMapping("/create")
    public ResponseEntity<String> createAdvertisementTier(@RequestBody AdvertisementTierDto advertisementTierDto) {
        advertisementTierService.createAdvertisementTier(advertisementTierDto);
        return ResponseEntity.ok("Advertisement tier created successfully");
    }

}

