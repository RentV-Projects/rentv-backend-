package com.example.rentv.services;

import com.example.rentv.dtos.ProfileDto;
import com.example.rentv.models.Profile;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {


    public void updateProfileName(Profile profile, String newName) {
        profile.updateName(newName);
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

