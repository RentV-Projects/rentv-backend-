package com.example.rentv.services;

import com.example.rentv.dtos.UserRegistrationRequest;
import com.example.rentv.models.ConcreteUser;
import com.example.rentv.models.Profile;
import com.example.rentv.models.Security;
import com.example.rentv.models.User;
import com.example.rentv.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void register(UserRegistrationRequest registrationRequest) {
        User newUser = new User();

        Security security = new Security();
        security.setLoginCredentials(registrationRequest.getEmail());
        String hashedPassword = passwordEncoder.encode(registrationRequest.getPassword());
        security.setPassword(hashedPassword);
        newUser.setSecurity(security);

        Profile profile = new Profile();
        profile.setName(registrationRequest.getName());
        profile.setAddress(registrationRequest.getAddress());
        profile.setAdditionalInfo(registrationRequest.getAdditionalInfo());
        newUser.setProfile(profile);

        userRepository.save(newUser);

        return ResponseEntity.ok("User registered successfully");
    }


    public void login(User user, String username, String password) {
        user.login(username, password);
    }

    public void logout(User user) {
        user.logout();
    }
}
