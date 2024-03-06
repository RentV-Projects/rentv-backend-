package com.example.rentv.services;

import com.example.rentv.dtos.AdvertisementDto;
import com.example.rentv.models.Advertisement;
import org.springframework.stereotype.Service;

@Service
public class AdvertisementService {


    public void updateAdvertisementContent(Advertisement advertisement, String newContent) {
        advertisement.updateContent(newContent);
    }

    public void changeAdvertisementStatus(Advertisement advertisement, String newStatus) {
        advertisement.changeStatus(newStatus);
    }

    public void createAdvertisement(AdvertisementDto advertisementDto) {
    }
}

