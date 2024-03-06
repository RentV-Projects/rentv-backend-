package com.example.rentv.controllers;

import com.example.rentv.models.Company;
import com.example.rentv.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/manageRental")
    public ResponseEntity<String> manageRental(@RequestParam Company company) {
        companyService.manageRental(company);
        return ResponseEntity.ok("Rental managed successfully");
    }

    @PostMapping("/postCar")
    public ResponseEntity<String> postCar(@RequestParam Company company) {
        companyService.postCar(company);
        return ResponseEntity.ok("Car posted successfully");
    }

    @PostMapping("/respondToReview")
    public ResponseEntity<String> respondToReview(@RequestParam Company company) {
        companyService.respondToReview(company);
        return ResponseEntity.ok("Response to review posted successfully");
    }

}

