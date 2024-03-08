package com.example.rentv.controllers;

import com.example.rentv.models.Payment;
import com.example.rentv.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/process")
    public ResponseEntity<String> processPayment(@RequestBody Payment paymentDto) {
        paymentService.processPayment(paymentDto);
        return ResponseEntity.ok("Payment processed successfully");
    }

}

