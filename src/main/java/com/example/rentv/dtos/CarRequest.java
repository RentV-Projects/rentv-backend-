package com.example.rentv.dtos;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
@Data
public class CarRequest {
    private String make;
    private String model;
    private int year;
    private String type;
    private List<String> features;
    private boolean availability;
    private List<MultipartFile> images;
}
