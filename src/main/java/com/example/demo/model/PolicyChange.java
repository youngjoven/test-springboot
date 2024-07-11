package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "POLICY_CHANGE")
public class PolicyChange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "policy_id")
    private Policy policy;

    private Date changeDate;
    private String changeType;
    private String details;

    // Getters and Setters
}
