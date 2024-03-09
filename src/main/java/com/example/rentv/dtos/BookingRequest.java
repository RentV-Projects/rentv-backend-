package com.example.rentv.dtos;

import com.example.rentv.models.Car;
import com.example.rentv.models.Customer;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class BookingRequest {
    private Customer customer;
    private Car car;
    private LocalDate pickupDate;
    private LocalDate dropOffDate;
    private BigDecimal price;

}
