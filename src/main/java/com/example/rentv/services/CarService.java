package com.example.rentv.services;


import com.example.rentv.dtos.CarRequest;
import com.example.rentv.models.Car;
import com.example.rentv.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarService {

@Autowired
  private CarRepository carRepository;

  public void uploadCar(CarRequest carRequest) {
    Car car = new Car();
    car.setMake(carRequest.getMake());
    car.setModel(carRequest.getModel());
    car.setYear(carRequest.getYear());
    car.setType(carRequest.getType());
    car.setFeatures(carRequest.getFeatures());
    car.setAvailability(carRequest.isAvailability());
    car.setImages(carRequest.getImages());

    Car savedCar = carRepository.save(car);

    if (carRequest.getImages() != null && !carRequest.getImages().isEmpty()) {
      for (String image : carRequest.getImages()) {
        uploadCarImage(savedCar.getId(), image);
      }
    }
  }


  public void uploadCarImage(Long carId, String imageData) {
    }
}

