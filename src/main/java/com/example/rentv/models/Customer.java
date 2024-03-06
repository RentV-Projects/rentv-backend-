package com.example.rentv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Customer extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "customer")
    private List<Review> reviews;

    public Customer(Long id, List<Booking> bookings, List<Review> reviews) {
        this.id = id;
        this.bookings = bookings;
        this.reviews = reviews;
    }

    public Customer(Security security, Profile profile, Long id, List<Booking> bookings, List<Review> reviews) {
        super(security, profile);
        this.id = id;
        this.bookings = bookings;
        this.reviews = reviews;
    }

    private String generateId() {
        return null;
    }

    public List<Car> searchForCars(String criteria) {
        return new ArrayList<>();
    }

    public void viewCarDetails(Car car) {
    }

    public List<CarImage> viewCarImages(Car car) {
        return new ArrayList<>();
    }

    public Booking bookCar(Car car, Date pickupDate, Date dropOffDate, double price) {
        return null;
    }

    public boolean manageBooking(String bookingId, String action) {
        return false;
    }
}
