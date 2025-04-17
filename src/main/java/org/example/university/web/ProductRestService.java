package org.example.university.web;

import org.example.university.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import repository.ProductRepository;

@RestController
public class ProductRestService {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable Long id) {
        Product product = productRepository.findById(id).orElse(null);
        return product;
    }
}
