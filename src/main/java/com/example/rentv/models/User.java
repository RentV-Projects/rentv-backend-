package com.example.rentv.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Security security;
    @OneToOne(cascade = CascadeType.ALL)
    private Profile profile;

    public User(Security security, Profile profile) {
        this.security = security;
        this.profile = profile;
    }

    public void login(String username, String password) {
    }

    public void logout() {
    }
}
