package com.example.rentv.services;

import com.example.rentv.dtos.UserRegistrationRequest;
import com.example.rentv.models.ConcreteUser;
import com.example.rentv.models.Profile;
import com.example.rentv.models.Security;
import com.example.rentv.models.User;
import com.example.rentv.repositories.SecurityRepository;
import com.example.rentv.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(UserRegistrationRequest registrationRequest) {
        User newUser = new User();

        Security security = new Security();

        Profile profile = new Profile();
        profile.setName(registrationRequest.getName());
        profile.setAddress(registrationRequest.getAddress());
        profile.setAdditionalInfo(registrationRequest.getAdditionalInfo());

        security.setEmail(registrationRequest.getEmail());
        security.setPassword(registrationRequest.getPassword());

        newUser.setProfile(profile);
        newUser.setSecurity(security);

        userRepository.save(newUser);
    }


    public boolean login(String email, String password) {
        Security security = SecurityRepository.findByEmail(email);
        if (security == null) {
            return false;
        }

        return password.equals(security.getPassword());
    }




    public void logout(User user) {
        user.logout();
    }
}
