package com.example.demo.service;

import com.example.demo.dao.PolicyRenewalDao;
import com.example.demo.model.PolicyRenewal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyRenewalService {

    @Autowired
    private PolicyRenewalDao policyRenewalDao;

    public List<PolicyRenewal> getAllPolicyRenewals() {
        return policyRenewalDao.findAll();
    }

    public PolicyRenewal getPolicyRenewalById(Long id) {
        return policyRenewalDao.findById(id).orElse(null);
    }

    public PolicyRenewal savePolicyRenewal(PolicyRenewal policyRenewal) {
        return policyRenewalDao.save(policyRenewal);
    }

    public void deletePolicyRenewal(Long id) {
        policyRenewalDao.deleteById(id);
    }
}
