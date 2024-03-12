package com.example.rentv.services;

import com.example.rentv.dtos.BookingRequest;
import com.example.rentv.models.Booking;
import com.example.rentv.models.Car;
import com.example.rentv.models.Customer;
import com.example.rentv.models.User;
import com.example.rentv.repositories.BookingRepository;
import com.example.rentv.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class BookingService {


    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public void bookCar(BookingRequest bookingRequest) {
        Customer customer = bookingRequest.getCustomer();
        Car car = bookingRequest.getCar();

        LocalDate pickupDate = bookingRequest.getPickupDate();
        LocalDate dropOffDate = bookingRequest.getDropOffDate();
        BigDecimal price = bookingRequest.getPrice();

//        User user = customer.getUser();
//
//        if (user == null) {
//            throw new IllegalArgumentException("User associated with the customer is null");
//        }
//
//        if (user.getId() == null) {
//            customerRepository.save(customer);
//        }

        Booking booking = new Booking(customer, car, pickupDate, dropOffDate, price);

        bookingRepository.save(booking);
    }

    public List<Booking> getCarBookings(Car car) {
        return null;
    }

    public void cancelBooking(Long bookingId) {
    }

    public void confirmBooking(Booking booking) {
    }

}

