package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "AGENT_COMMISSION")
public class AgentCommission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

    @ManyToOne
    @JoinColumn(name = "policy_id")
    private Policy policy;

    private Double commissionAmount;
    private Date commissionDate;

    // Getters and Setters
}
