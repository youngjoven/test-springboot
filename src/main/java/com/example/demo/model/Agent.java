package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "AGENT")
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "agent")
    private List<Policy> policies;

    @OneToMany(mappedBy = "agent")
    private List<AgentCommission> agentCommissions;

    // Getters and Setters
}
