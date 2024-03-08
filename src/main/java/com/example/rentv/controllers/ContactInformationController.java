package com.example.rentv.controllers;

import com.example.rentv.models.ContactInformation;
import com.example.rentv.services.ContactInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/contact-information")
public class ContactInformationController {

    @Autowired
    private ContactInformationService contactInformationService;

    @PostMapping("/update/{userId}")
    public ResponseEntity<String> updatePhoneNumber(@PathVariable ContactInformation contact, String newContact) {
        contactInformationService.updatePhoneNumber(contact, newContact);
        return ResponseEntity.ok("Contact information updated successfully");
    }

}

