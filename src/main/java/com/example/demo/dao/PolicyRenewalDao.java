package com.example.demo.dao;

import com.example.demo.model.PolicyRenewal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRenewalDao extends JpaRepository<PolicyRenewal, Long> {
}
