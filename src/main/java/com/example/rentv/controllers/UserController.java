package com.example.rentv.controllers;

import com.example.rentv.dtos.UserRegistrationRequest;
import com.example.rentv.models.User;
import com.example.rentv.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserRegistrationRequest registrationRequest) {
        userService.register(registrationRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        boolean loginSuccessful = userService.login(username, password);
        if (loginSuccessful) {
            return ResponseEntity.ok("User logged in successfully");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
    }


    @GetMapping("/logout")
    public ResponseEntity<String> logout(@RequestParam User user) {
        userService.logout(user);
        return ResponseEntity.ok("User logged out successfully");
    }

}
