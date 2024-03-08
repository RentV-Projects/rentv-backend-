package com.example.rentv.controllers;

import com.example.rentv.models.Security;
import com.example.rentv.services.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/security")
public class SecurityController {

    @Autowired
    private SecurityService securityService;

    @PostMapping("/grantPermission/{userId}/{permission}")
    public ResponseEntity<String> grantPermission(@PathVariable Security userId, @PathVariable String permission) {
        securityService.grantPermission(userId, permission);
        return ResponseEntity.ok("Permission granted successfully");
    }

}

