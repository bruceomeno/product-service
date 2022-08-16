package com.aushi.product.controller;

import com.aushi.product.entities.Product;
import com.aushi.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product) {
        log.info("Inside saveProduct method in ProductController");
        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable("id") Long productId) {
        log.info("Inside findProductById method in ProductController");
        return productService.findProductById(productId);
    }
}
