package com.project.productservice;

import com.project.productservice.model.Product;
import com.project.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.math.BigDecimal;

@SpringBootApplication
@EnableEurekaClient
@RequiredArgsConstructor
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
