package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "POLICY")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

    private String policyNumber;
    private Date startDate;
    private Date endDate;
    private Double premium;

    @OneToMany(mappedBy = "policy")
    private List<Claim> claims;

    @OneToMany(mappedBy = "policy")
    private List<PolicyChange> policyChanges;

    @OneToMany(mappedBy = "policy")
    private List<PolicyRenewal> policyRenewals;

    @OneToMany(mappedBy = "policy")
    private List<RiskAssessment> riskAssessments;

    // Getters and Setters
}
