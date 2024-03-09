package com.example.rentv.controllers;

import com.example.rentv.dtos.CarRequest;
import com.example.rentv.models.Car;
import com.example.rentv.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadCar(@RequestBody CarRequest carRequest) {
        carService.uploadCar(carRequest);
        return ResponseEntity.ok("Car uploaded successfully");
    }

}

