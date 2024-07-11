package com.example.demo.service;

import com.example.demo.dao.ClaimDao;
import com.example.demo.model.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimService {

    @Autowired
    private ClaimDao claimDao;

    public List<Claim> getAllClaims() {
        return claimDao.findAll();
    }

    public Claim saveClaim(Claim claim) {
        return claimDao.save(claim);
    }
}
