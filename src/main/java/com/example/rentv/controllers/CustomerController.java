package com.example.rentv.controllers;

import com.example.rentv.dtos.BookingRequest;
import com.example.rentv.models.Car;
import com.example.rentv.models.Customer;
import com.example.rentv.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/searchForAllCars")
    public ResponseEntity<List<Car>> searchForCars(@RequestParam boolean availability) {
        List<Car> cars = customerService.searchForAllCars(availability);
        return ResponseEntity.ok(cars);
    }

    @GetMapping("/searchForACar/{carId}")
    public ResponseEntity<Car> viewCarDetails(@PathVariable Long carId) {
        Car car = customerService.searchForACar(carId);
        if (car != null) {
            return ResponseEntity.ok(car);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}

