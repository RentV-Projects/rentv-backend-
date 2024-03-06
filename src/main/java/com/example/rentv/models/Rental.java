package com.example.rentv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@NoArgsConstructor
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Car car;
    @ManyToOne
    private Company company;
    @OneToMany
    private List<Booking> bookingHistory;


    public Rental(Long id, Car car, Company company, List<Booking> bookingHistory) {
        this.id = id;
        this.car = car;
        this.company = company;
        this.bookingHistory = bookingHistory;
    }

    public void addBooking(Booking booking) {
        bookingHistory.add(booking);
    }

    public void removeBooking(Booking booking) {
    }

}

