package com.example.rentv.controllers;

import com.example.rentv.models.UserImage;
import com.example.rentv.services.UserImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/user-images")
public class UserImageController {

    @Autowired
    private UserImageService userImageService;

    @PostMapping("/upload/{userId}")
    public ResponseEntity<String> uploadUserImage(@PathVariable Long userId, @RequestParam UserImage imageData) {
        userImageService.uploadUserImage(userId, imageData);
        return ResponseEntity.ok("User image uploaded successfully");
    }

}

