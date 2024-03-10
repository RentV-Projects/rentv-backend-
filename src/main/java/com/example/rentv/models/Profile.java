package com.example.rentv.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String additionalInfo;


    public Profile(String firstName, String lastName, String address, String additionalInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.additionalInfo = additionalInfo;
    }

    public Profile() {

    }

    public void updateFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void updateLastName(String firstName) {
        this.firstName = firstName;
    }

    public void updateAddress(String address) {
        this.address = address;
    }

    public void updateAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
