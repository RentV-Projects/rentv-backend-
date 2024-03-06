package com.example.rentv.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ContactInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phoneNumber;
    private String emailAddress;
    private String accountNumber;

    public ContactInformation(String phoneNumber, String emailAddress, String accountNumber) {
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.accountNumber = accountNumber;
    }

    public void updatePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void updateEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void updateAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


}

