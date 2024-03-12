package com.example.rentv.services;

import com.example.rentv.dtos.CarRequest;
import com.example.rentv.models.Car;
import com.example.rentv.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CarService {

  private final CarRepository carRepository;

  private final FileStorageService fileStorageService;

  public CarService (FileStorageService fileStorageService, CarRepository carRepository){
    this.fileStorageService = fileStorageService;
    this.carRepository = carRepository;
  }

  public void uploadCar(CarRequest carRequest, List<MultipartFile> imageFiles){
    Car car = new Car();
    car.setMake(carRequest.getMake());
    car.setModel(carRequest.getModel());
    car.setYear(carRequest.getYear());
    car.setType(carRequest.getType());
    car.setFeatures(carRequest.getFeatures());
    car.setAvailability(carRequest.isAvailability());

    if (imageFiles != null && !imageFiles.isEmpty()) {
      for (MultipartFile imageFile : imageFiles) {
        String imagePath = fileStorageService.storeFile(imageFile);
        car.getImages().add(imagePath);
      }
    }

    carRepository.save(car);
  }

}
