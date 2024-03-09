package com.example.rentv.services;

import com.example.rentv.models.Booking;
import com.example.rentv.models.Customer;
import com.example.rentv.models.Review;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {


    public void moderateReviews() {
    }

    public void moderateAdvertisements() {
    }

    public List<Booking> getCustomerBookings(Customer customer) {
        return null;
    }

    public void manageBooking(Customer customer, String bookingId, String action) {
    }

    public List<Review> getCustomerReviews(Customer customer) {
        return null;
    }

    public void confirmBooking(Booking booking) {
    }
}

