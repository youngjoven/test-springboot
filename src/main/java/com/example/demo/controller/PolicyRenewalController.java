package com.example.demo.controller;

import com.example.demo.model.PolicyRenewal;
import com.example.demo.service.PolicyRenewalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policyrenewals")
public class PolicyRenewalController {

    @Autowired
    private PolicyRenewalService policyRenewalService;

    @GetMapping
    public List<PolicyRenewal> getAllPolicyRenewals() {
        return policyRenewalService.getAllPolicyRenewals();
    }

    @GetMapping("/{id}")
    public PolicyRenewal getPolicyRenewalById(@PathVariable Long id) {
        return policyRenewalService.getPolicyRenewalById(id);
    }

    @PostMapping
    public PolicyRenewal createPolicyRenewal(@RequestBody PolicyRenewal policyRenewal) {
        return policyRenewalService.savePolicyRenewal(policyRenewal);
    }

    @DeleteMapping("/{id}")
    public void deletePolicyRenewal(@PathVariable Long id) {
        policyRenewalService.deletePolicyRenewal(id);
    }
}
