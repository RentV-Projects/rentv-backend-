package com.example.rentv.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private String paymentMethod;
    private String transactionDetails;
    private String gatewayIntegrationDetails;


    public Payment(Long id, double amount, String paymentMethod, String transactionDetails, String gatewayIntegrationDetails) {
        this.id = id;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.transactionDetails = transactionDetails;
        this.gatewayIntegrationDetails = gatewayIntegrationDetails;
    }

    public void processPayment() {
    }

    public void refundPayment() {
    }

}

