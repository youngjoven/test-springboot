package com.example.demo.service;

import com.example.demo.dao.PolicyChangeDao;
import com.example.demo.model.PolicyChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyChangeService {

    @Autowired
    private PolicyChangeDao policyChangeDao;

    public List<PolicyChange> getAllPolicyChanges() {
        return policyChangeDao.findAll();
    }

    public PolicyChange getPolicyChangeById(Long id) {
        return policyChangeDao.findById(id).orElse(null);
    }

    public PolicyChange savePolicyChange(PolicyChange policyChange) {
        return policyChangeDao.save(policyChange);
    }

    public void deletePolicyChange(Long id) {
        policyChangeDao.deleteById(id);
    }
}
