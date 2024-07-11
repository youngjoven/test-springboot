package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String category;
    private Double basePremium;

    @OneToMany(mappedBy = "product")
    private List<Policy> policies;

    @OneToMany(mappedBy = "product")
    private List<ProductFeature> productFeatures;

    // Getters and Setters
}
