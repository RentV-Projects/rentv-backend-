package com.example.rentv.services;

import com.example.rentv.models.ContactInformation;
import org.springframework.stereotype.Service;

@Service
public class ContactInformationService {


    public void updatePhoneNumber(ContactInformation contactInfo, String newPhoneNumber) {
            contactInfo.updatePhoneNumber(newPhoneNumber);
    }

    public void updateEmailAddress(ContactInformation contactInfo, String newEmailAddress) {
        contactInfo.updateEmailAddress(newEmailAddress);
    }

    public void updateAccountNumber(ContactInformation contactInfo, String newAccountNumber) {
        contactInfo.updateAccountNumber(newAccountNumber);
    }

}

