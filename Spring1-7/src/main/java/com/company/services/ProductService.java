package com.company.services;

import com.company.entities.Product;
import com.company.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll(){return productRepository.findAll();}

    public Optional<Product> getById(Long id){return productRepository.findById(id);}


}
