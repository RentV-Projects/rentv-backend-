package com.example.rentv.services;

import com.example.rentv.dtos.RentalDto;
import com.example.rentv.models.Booking;
import com.example.rentv.models.Rental;
import org.springframework.stereotype.Service;

@Service
public class RentalService {


    public void addBookingToRental(Rental rental, Booking booking) {
        rental.addBooking(booking);
    }

    public void removeBookingFromRental(Rental rental, Booking booking) {
        rental.removeBooking(booking);
    }

    public void createRental(RentalDto rentalDto) {
    }
}

