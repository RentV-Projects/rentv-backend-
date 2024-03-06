package com.example.rentv.controllers;

import com.example.rentv.dtos.RentalDto;
import com.example.rentv.services.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rentals")
public class RentalController {

    @Autowired
    private RentalService rentalService;

    @PostMapping("/create")
    public ResponseEntity<String> createRental(@RequestBody RentalDto rentalDto) {
        rentalService.createRental(rentalDto);
        return ResponseEntity.ok("Rental created successfully");
    }

}

