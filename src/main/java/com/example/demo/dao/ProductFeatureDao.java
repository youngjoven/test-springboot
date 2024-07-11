package com.example.demo.dao;

import com.example.demo.model.ProductFeature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductFeatureDao extends JpaRepository<ProductFeature, Long> {
}
