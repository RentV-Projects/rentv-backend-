package com.example.rentv.dtos;

import lombok.Data;

@Data
public class UserRegistrationRequest {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String address;
    private String additionalInfo;
}

