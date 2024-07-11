package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_FEATURE")
public class ProductFeature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private String featureName;
    private String featureDescription;

    // Getters and Setters
}
