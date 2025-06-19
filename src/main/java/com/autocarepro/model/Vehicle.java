package com.autocarepro.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank
    private String registrationNumber;
    @NotBlank
    private String make;
    @NotBlank
    private String model;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonBackReference
    private Customer customer;


    public Vehicle() {
    }

    public Vehicle(int id, String registrationNumber, String make, String model, Customer customer) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public @NotBlank String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(@NotBlank String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public @NotBlank String getMake() {
        return make;
    }

    public void setMake(@NotBlank String make) {
        this.make = make;
    }

    public @NotBlank String getModel() {
        return model;
    }

    public void setModel(@NotBlank String model) {
        this.model = model;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer( Customer customer) {
        this.customer = customer;
    }
}
