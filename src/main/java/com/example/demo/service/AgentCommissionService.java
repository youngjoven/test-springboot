package com.example.demo.service;

import com.example.demo.dao.AgentCommissionDao;
import com.example.demo.model.AgentCommission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentCommissionService {

    @Autowired
    private AgentCommissionDao agentCommissionDao;

    public List<AgentCommission> getAllAgentCommissions() {
        return agentCommissionDao.findAll();
    }

    public AgentCommission getAgentCommissionById(Long id) {
        return agentCommissionDao.findById(id).orElse(null);
    }

    public AgentCommission saveAgentCommission(AgentCommission agentCommission) {
        return agentCommissionDao.save(agentCommission);
    }

    public void deleteAgentCommission(Long id) {
        agentCommissionDao.deleteById(id);
    }
}
