package com.example.rentv.services;

import com.example.rentv.dtos.BookingRequest;
import com.example.rentv.models.*;
import com.example.rentv.repositories.BookingRepository;
import com.example.rentv.repositories.CarRepository;
import com.example.rentv.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public List<Car> searchForAllCars(boolean availability) {
        return carRepository.findByAvailability(availability);
    }

    public void bookCar(BookingRequest bookingRequest) {
        Customer customer = bookingRequest.getCustomer();
        Car car = bookingRequest.getCar();
        LocalDate pickupDate = bookingRequest.getPickupDate();
        LocalDate dropOffDate = bookingRequest.getDropOffDate();
        BigDecimal price = bookingRequest.getPrice();
        User user = customer.getUser();

        if (user.getId() == null) {
            customerRepository.save(customer);
        }

        Booking booking = new Booking(user, car, pickupDate, dropOffDate, price);

        bookingRepository.save(booking);
    }

    public Car searchForACar(Long carId) {
        return carRepository.findById(carId).orElse(null);
    }


}
