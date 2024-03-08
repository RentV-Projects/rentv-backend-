package com.example.rentv.controllers;

import com.example.rentv.dtos.AdvertisementDto;
import com.example.rentv.services.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/advertisements")
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;

    @PostMapping("/create")
    public ResponseEntity<String> createAdvertisement(@RequestBody AdvertisementDto advertisementDto) {
        advertisementService.createAdvertisement(advertisementDto);
        return ResponseEntity.ok("Advertisement created successfully");
    }

}

