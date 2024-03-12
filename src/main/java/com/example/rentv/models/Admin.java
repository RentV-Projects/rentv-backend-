package com.example.rentv.models;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Admin extends User {
    public Admin(Security security, Profile profile) {
        super(security, profile);
    }

    public void moderateReviews() {
    }

    public void moderateAdvertisement() {
    }
    public void manageBooking(){

    }
}

