package com.example.demo.dao;

import com.example.demo.model.PolicyChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyChangeDao extends JpaRepository<PolicyChange, Long> {
}
