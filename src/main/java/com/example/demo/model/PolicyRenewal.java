package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "POLICY_RENEWAL")
public class PolicyRenewal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "policy_id")
    private Policy policy;

    private Date renewalDate;
    private Date newEndDate;
    private Double newPremium;

    // Getters and Setters
}
