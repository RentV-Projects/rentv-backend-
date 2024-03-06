package com.example.rentv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
public class Company extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "company")
    private List<Rental> rentals;

    public Company(Security security, Profile profile) {
        super(security, profile);
        this.rentals = new ArrayList<>();
    }

    public void manageRental() {
    }

    public void postCar() {
    }

    public void respondToReview() {
    }
}

