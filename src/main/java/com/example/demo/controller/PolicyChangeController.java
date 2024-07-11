package com.example.demo.controller;

import com.example.demo.model.PolicyChange;
import com.example.demo.service.PolicyChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policychanges")
public class PolicyChangeController {

    @Autowired
    private PolicyChangeService policyChangeService;

    @GetMapping
    public List<PolicyChange> getAllPolicyChanges() {
        return policyChangeService.getAllPolicyChanges();
    }

    @GetMapping("/{id}")
    public PolicyChange getPolicyChangeById(@PathVariable Long id) {
        return policyChangeService.getPolicyChangeById(id);
    }

    @PostMapping
    public PolicyChange createPolicyChange(@RequestBody PolicyChange policyChange) {
        return policyChangeService.savePolicyChange(policyChange);
    }

    @DeleteMapping("/{id}")
    public void deletePolicyChange(@PathVariable Long id) {
        policyChangeService.deletePolicyChange(id);
    }
}
