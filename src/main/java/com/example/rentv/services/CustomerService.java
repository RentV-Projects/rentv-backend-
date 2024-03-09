package com.example.rentv.services;

import com.example.rentv.dtos.BookingRequest;
import com.example.rentv.models.Booking;
import com.example.rentv.models.Car;
import com.example.rentv.models.Customer;
import com.example.rentv.models.Review;
import com.example.rentv.repositories.BookingRepository;
import com.example.rentv.repositories.CarRepository;
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

    public List<Car> searchForAllCars(boolean availability) {
        return carRepository.findByAvailability(availability);
    }

    public void bookCar(BookingRequest bookingRequest) {
        Customer customer = bookingRequest.getCustomer();
        Car car = bookingRequest.getCar();
        LocalDate pickupDate = bookingRequest.getPickupDate();
        LocalDate dropOffDate = bookingRequest.getDropOffDate();
        BigDecimal price = bookingRequest.getPrice();

        Booking booking = new Booking(customer, car, pickupDate, dropOffDate, price);

        bookingRepository.save(booking);
    }

    public Car searchForACar(Long carId) {
        return carRepository.findById(carId).orElse(null);
    }


}
