package com.example.rentv.services;

import com.example.rentv.models.Booking;
import com.example.rentv.models.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {


    public List<Car> getAllCars() {
        return null;
    }

    public Car getCarById(String carId) {
        return null;
    }

    public List<Booking> getCarBookings(Car car) {
        return null;
    }

    public void uploadCarImage(Long carId, String imageData) {
    }
}

