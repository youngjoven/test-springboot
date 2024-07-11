package com.example.demo.service;

import com.example.demo.dao.ProductFeatureDao;
import com.example.demo.model.ProductFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductFeatureService {

    @Autowired
    private ProductFeatureDao productFeatureDao;

    public List<ProductFeature> getAllProductFeatures() {
        return productFeatureDao.findAll();
    }

    public ProductFeature getProductFeatureById(Long id) {
        return productFeatureDao.findById(id).orElse(null);
    }

    public ProductFeature saveProductFeature(ProductFeature productFeature) {
        return productFeatureDao.save(productFeature);
    }

    public void deleteProductFeature(Long id) {
        productFeatureDao.deleteById(id);
    }
}
