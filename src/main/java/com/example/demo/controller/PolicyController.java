package com.example.demo.controller;

import com.example.demo.model.Policy;
import com.example.demo.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @GetMapping
    public List<Policy> getAllPolicies() {
        return policyService.getAllPolicies();
    }

    @GetMapping("/{id}")
    public Policy getPolicyById(@PathVariable Long id) {
        return policyService.getPolicyById(id);
    }

    @PostMapping
    public Policy createPolicy(@RequestBody Policy policy) {
        return policyService.savePolicy(policy);
    }

    @DeleteMapping("/{id}")
    public void deletePolicy(@PathVariable Long id) {
        policyService.deletePolicy(id);
    }
}
