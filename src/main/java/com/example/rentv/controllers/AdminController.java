package com.example.rentv.controllers;

import com.example.rentv.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/moderateReviews")
    public ResponseEntity<String> moderateReviews() {
        adminService.moderateReviews();
        return ResponseEntity.ok("Reviews moderated successfully");
    }

    @PostMapping("/moderateAdvertisement")
    public ResponseEntity<String> moderateAdvertisement() {
        adminService.moderateAdvertisements();
        return ResponseEntity.ok("Advertisements moderated successfully");
    }

}

