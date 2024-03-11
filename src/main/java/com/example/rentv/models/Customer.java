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
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "customer")
    private List<Review> reviews;

    public Customer(User user) {
        this.user = user;
        this.bookings = new ArrayList<>();
        this.reviews = new ArrayList<>();
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
