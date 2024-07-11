package com.example.demo.service;

import com.example.demo.dao.RiskAssessmentDao;
import com.example.demo.model.RiskAssessment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskAssessmentService {

    @Autowired
    private RiskAssessmentDao riskAssessmentDao;

    public List<RiskAssessment> getAllRiskAssessments() {
        return riskAssessmentDao.findAll();
    }

    public RiskAssessment getRiskAssessmentById(Long id) {
        return riskAssessmentDao.findById(id).orElse(null);
    }

    public RiskAssessment saveRiskAssessment(RiskAssessment riskAssessment) {
        return riskAssessmentDao.save(riskAssessment);
    }

    public void deleteRiskAssessment(Long id) {
        riskAssessmentDao.deleteById(id);
    }
}
