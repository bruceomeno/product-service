package com.aushi.product.service;

import com.aushi.product.entities.Product;
import com.aushi.product.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product) {
        log.info("Inside saveProduct method in ProductService");
        return productRepository.save(product);
    }

    public Product findProductById(Long productId) {
        log.info("Inside findProductById method in ProductService");
        return productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Result not found"));
    }
}
