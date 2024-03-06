package com.example.rentv.controllers;

import com.example.rentv.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/uploadImage")
    public ResponseEntity<String> uploadCarImage(@RequestParam Long carId, @RequestParam String imageData) {
        carService.uploadCarImage(carId, imageData);
        return ResponseEntity.ok("Car image uploaded successfully");
    }

}

