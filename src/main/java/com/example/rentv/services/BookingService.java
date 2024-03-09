package com.example.rentv.services;

import com.example.rentv.models.Booking;
import com.example.rentv.models.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    public List<Booking> getCarBookings(Car car) {
        return null;
    }

    public void cancelBooking(Long bookingId) {
    }

    public void confirmBooking(Booking booking) {
    }

}

