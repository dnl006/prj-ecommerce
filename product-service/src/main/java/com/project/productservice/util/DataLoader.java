package com.project.productservice.util;

import com.project.productservice.model.Product;
import com.project.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    public void run(String... args) throws Exception {
        if (productRepository.count() < 1) {
            Product product = new Product();
            product.setName("Macbook 13");
            product.setDescription("Macbook 13");
            product.setPrice(BigDecimal.valueOf(100000));

            productRepository.save(product);
        }
    }
}
