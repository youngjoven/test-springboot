package com.example.demo.controller;

import com.example.demo.model.AgentCommission;
import com.example.demo.service.AgentCommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agentcommissions")
public class AgentCommissionController {

    @Autowired
    private AgentCommissionService agentCommissionService;

    @GetMapping
    public List<AgentCommission> getAllAgentCommissions() {
        return agentCommissionService.getAllAgentCommissions();
    }

    @GetMapping("/{id}")
    public AgentCommission getAgentCommissionById(@PathVariable Long id) {
        return agentCommissionService.getAgentCommissionById(id);
    }

    @PostMapping
    public AgentCommission createAgentCommission(@RequestBody AgentCommission agentCommission) {
        return agentCommissionService.saveAgentCommission(agentCommission);
    }

    @DeleteMapping("/{id}")
    public void deleteAgentCommission(@PathVariable Long id) {
        agentCommissionService.deleteAgentCommission(id);
    }
}
