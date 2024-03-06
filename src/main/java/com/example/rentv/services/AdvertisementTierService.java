package com.example.rentv.services;

import com.example.rentv.dtos.AdvertisementTierDto;
import com.example.rentv.models.AdvertisementTier;
import org.springframework.stereotype.Service;

@Service
public class AdvertisementTierService {


    public void updateTierDescription(AdvertisementTier tier, String newDescription) {
        tier.updateDescription(newDescription);
    }

    public void updateTierCost(AdvertisementTier tier, double newCost) {
        tier.updateCost(newCost);
    }

    public void addFeatureToTier(AdvertisementTier tier, String feature) {
        tier.addFeature(feature);
    }

    public void removeFeatureFromTier(AdvertisementTier tier, String feature) {
        tier.removeFeature(feature);
    }

    public void createAdvertisementTier(AdvertisementTierDto advertisementTierDto) {
    }
}

