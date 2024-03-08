package com.example.rentv.services;

import com.example.rentv.dtos.UserRegistrationRequest;
import com.example.rentv.models.Profile;
import com.example.rentv.models.Security;
import com.example.rentv.models.User;
import com.example.rentv.repositories.SecurityRepository;
import com.example.rentv.repositories.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final SecurityRepository securityRepository;
    private final HttpServletRequest request;
    private final HttpServletResponse response;

    public UserService(UserRepository userRepository, SecurityRepository securityRepository,
                       HttpServletRequest request, HttpServletResponse response) {
        this.userRepository = userRepository;
        this.securityRepository = securityRepository;
        this.request = request;
        this.response = response;
    }



    public void register(UserRegistrationRequest registrationRequest) {
        if (userRepository.existsBySecurityEmail(registrationRequest.getEmail())) {
            throw new IllegalArgumentException("Email address already exists");
        }

        User newUser = new User();
        Security security = new Security();
        Profile profile = new Profile();

        profile.setName(registrationRequest.getName());
        profile.setAddress(registrationRequest.getAddress());

        security.setEmail(registrationRequest.getEmail());
        security.setPassword(registrationRequest.getPassword());

        newUser.setProfile(profile);
        newUser.setSecurity(security);

        try {
            userRepository.save(newUser);
        } catch (DataIntegrityViolationException ex) {
            throw new IllegalStateException("Failed to register user", ex);
        }
    }

    public boolean login(String email, String password) {
        Security security = securityRepository.findByEmail(email);
        if (security == null) {
            return false;
        }

        return password.equals(security.getPassword());
    }





    public void logout() {
    }
}
