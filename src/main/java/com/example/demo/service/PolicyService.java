package com.example.demo.service;

import com.example.demo.dao.PolicyDao;
import com.example.demo.model.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {

    @Autowired
    private PolicyDao policyDao;

    public List<Policy> getAllPolicies() {
        return policyDao.findAll();
    }

    public Policy getPolicyById(Long id) {
        return policyDao.findById(id).orElse(null);
    }

    public Policy savePolicy(Policy policy) {
        return policyDao.save(policy);
    }

    public void deletePolicy(Long id) {
        policyDao.deleteById(id);
    }
}
