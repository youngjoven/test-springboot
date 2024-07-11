package com.example.demo.dao;

import com.example.demo.model.RiskAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskAssessmentDao extends JpaRepository<RiskAssessment, Long> {
}
