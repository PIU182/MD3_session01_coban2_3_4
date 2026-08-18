package com.example.productmanagement;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(UUID.randomUUID().toString(), "Sua chua", 15000),
            new Product(UUID.randomUUID().toString(), "Bim Bim", 20000),
            new Product(UUID.randomUUID().toString(), "My tom", 10000)
    );

    public List<Product> getAllProducts() {
        return products;
    }

}
