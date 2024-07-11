package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private String type;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    // Getters and Setters
}
