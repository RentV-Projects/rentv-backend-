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


    public List<Car> searchForAllCars(boolean availability) {
        return carRepository.findByAvailability(availability);
    }



    public Car searchForACar(Long carId) {
        return carRepository.findById(carId).orElse(null);
    }


}
