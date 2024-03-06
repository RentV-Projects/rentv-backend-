package com.example.rentv.controllers;

import com.example.rentv.dtos.ProfileDto;
import com.example.rentv.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping("/update/{userId}")
    public ResponseEntity<String> updateProfile(@PathVariable Long userId, @RequestBody ProfileDto profileDto) {
        profileService.updateProfile(userId, profileDto);
        return ResponseEntity.ok("Profile updated successfully");
    }

}

