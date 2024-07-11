package com.example.demo.dao;

import com.example.demo.model.AgentCommission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentCommissionDao extends JpaRepository<AgentCommission, Long> {
}
