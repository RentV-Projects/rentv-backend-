package com.example.rentv.controllers;

import com.example.rentv.dtos.CarDto;
import com.example.rentv.models.Individual;
import com.example.rentv.services.IndividualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/individuals")
public class IndividualController {

    @Autowired
    private IndividualService individualService;

    @PostMapping("/registerCar")
    public ResponseEntity<String> registerCar(@RequestBody Individual carDto) {
        individualService.registerCar(carDto);
        return ResponseEntity.ok("Car registered successfully");
    }

    @PostMapping("/uploadCarPictures/{carId}")
    public ResponseEntity<String> uploadCarPictures(@PathVariable Long carId, @RequestParam String imageData) {
        individualService.uploadCarPictures(carId, imageData);
        return ResponseEntity.ok("Car pictures uploaded successfully");
    }

}

