package com.example.rentv.services;

import com.example.rentv.models.Booking;
import com.example.rentv.models.Car;
import com.example.rentv.models.Customer;
import com.example.rentv.models.Review;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CustomerService {


    public List<Car> searchForCars(String criteria) {
        return null;
    }

    public void bookCar(Customer customer, Car car, Date pickupDate, Date dropOffDate, double price) {
    }

    public List<Booking> getCustomerBookings(Customer customer) {
        return null;
    }

    public void manageBooking(Customer customer, String bookingId, String action) {
    }

    public List<Review> getCustomerReviews(Customer customer) {
        return null;
    }

    public Object viewCarDetails(Long carId) {
        return null;
    }

    public Object viewCarImages(Long carId) {
        return null;
    }
}

