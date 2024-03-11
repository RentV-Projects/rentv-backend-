package com.example.rentv.controllers;

import com.example.rentv.dtos.BookingRequest;
import com.example.rentv.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/bookCar")
    public ResponseEntity<String> bookCar(@RequestBody BookingRequest bookingRequest) {
        bookingService.bookCar(bookingRequest);

        return ResponseEntity.ok("Car booked successfully");
    }
    @PostMapping("/cancel")
    public ResponseEntity<String> cancelBooking(@RequestParam("bookingId") Long bookingId) {
        bookingService.cancelBooking(bookingId);
        return ResponseEntity.ok("Booking canceled successfully");
    }


}

