package com.example.demo.controller;

import com.example.demo.model.RiskAssessment;
import com.example.demo.service.RiskAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/riskassessments")
public class RiskAssessmentController {

    @Autowired
    private RiskAssessmentService riskAssessmentService;

    @GetMapping
    public List<RiskAssessment> getAllRiskAssessments() {
        return riskAssessmentService.getAllRiskAssessments();
    }

    @GetMapping("/{id}")
    public RiskAssessment getRiskAssessmentById(@PathVariable Long id) {
        return riskAssessmentService.getRiskAssessmentById(id);
    }

    @PostMapping
    public RiskAssessment createRiskAssessment(@RequestBody RiskAssessment riskAssessment) {
        return riskAssessmentService.saveRiskAssessment(riskAssessment);
    }

    @DeleteMapping("/{id}")
    public void deleteRiskAssessment(@PathVariable Long id) {
        riskAssessmentService.deleteRiskAssessment(id);
    }
}
