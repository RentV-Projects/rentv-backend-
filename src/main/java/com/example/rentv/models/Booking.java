package com.example.rentv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Car car;
    private LocalDate pickupDate;
    private LocalDate dropOffDate;
    private BigDecimal price;


    public Booking(Long id, Customer customer, Car car, LocalDate pickupDate, LocalDate dropOffDate, BigDecimal price) {
        this.id = id;
        this.customer = customer;
        this.car = car;
        this.pickupDate = pickupDate;
        this.dropOffDate = dropOffDate;
        this.price = price;
    }

    public void cancelBooking() {
    }

    public void bookCar(DataSource dataSource) {
    }
}

