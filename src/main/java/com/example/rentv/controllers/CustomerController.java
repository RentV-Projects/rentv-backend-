package com.example.rentv.controllers;

import com.example.rentv.models.Car;
import com.example.rentv.models.Customer;
import com.example.rentv.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
@CrossOrigin
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/searchForCars")
    public ResponseEntity<?> searchForCars(@RequestParam String criteria) {
        return ResponseEntity.ok(customerService.searchForCars(criteria));
    }

    @GetMapping("/viewCarDetails/{carId}")
    public ResponseEntity<?> viewCarDetails(@PathVariable Long carId) {
        return ResponseEntity.ok(customerService.viewCarDetails(carId));
    }

    @GetMapping("/viewCarImages/{carId}")
    public ResponseEntity<?> viewCarImages(@PathVariable Long carId) {
        return ResponseEntity.ok(customerService.viewCarImages(carId));
    }

    @PostMapping("/bookCar")
    public ResponseEntity<String> bookCar(@RequestParam Customer customerId, @RequestParam Car carId, @RequestParam Date pickupDate, @RequestParam Date dropOffDate, @RequestParam double price) {
        customerService.bookCar(customerId, carId, pickupDate, dropOffDate, price);
        return ResponseEntity.ok("Car booked successfully");
    }

    @PostMapping("/manageBooking/{bookingId}")
    public ResponseEntity<String> manageBooking(@PathVariable Customer customer, @RequestParam String bookingId, @RequestParam String action) {
        customerService.manageBooking(customer, bookingId, action);
        return ResponseEntity.ok("Booking managed successfully");
    }

}

