package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RISK_ASSESSMENT")
public class RiskAssessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "policy_id")
    private Policy policy;

    private Date assessmentDate;
    private String riskLevel;
    private String notes;

    // Getters and Setters
}
