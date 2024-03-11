package com.example.rentv.services;

import com.example.rentv.dtos.ProfileDto;
import com.example.rentv.models.Profile;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {


    public void updateProfileFirstName(Profile profile, String newFirstName) {
        profile.updateFirstName(newFirstName);
    }
    public void updateProfileLastName(Profile profile, String newLastName) {
        profile.updateLastName(newLastName);
    }

    public void updateProfileAddress(Profile profile, String newAddress) {
        profile.updateAddress(newAddress);
    }

    public void updateProfileAdditionalInfo(Profile profile, String newAdditionalInfo) {
        profile.updateAdditionalInfo(newAdditionalInfo);
    }

    public void updateProfile(Long userId, ProfileDto profileDto) {
    }
}

