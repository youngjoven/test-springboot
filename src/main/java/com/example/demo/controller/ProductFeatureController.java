package com.example.demo.controller;

import com.example.demo.model.ProductFeature;
import com.example.demo.service.ProductFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productfeatures")
public class ProductFeatureController {

    @Autowired
    private ProductFeatureService productFeatureService;

    @GetMapping
    public List<ProductFeature> getAllProductFeatures() {
        return productFeatureService.getAllProductFeatures();
    }

    @GetMapping("/{id}")
    public ProductFeature getProductFeatureById(@PathVariable Long id) {
        return productFeatureService.getProductFeatureById(id);
    }

    @PostMapping
    public ProductFeature createProductFeature(@RequestBody ProductFeature productFeature) {
        return productFeatureService.saveProductFeature(productFeature);
    }

    @DeleteMapping("/{id}")
    public void deleteProductFeature(@PathVariable Long id) {
        productFeatureService.deleteProductFeature(id);
    }
}
