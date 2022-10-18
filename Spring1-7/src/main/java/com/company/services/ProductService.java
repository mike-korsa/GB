package com.company.services;

import com.company.entities.Product;
import com.company.repositories.ProductRepository;
import com.company.repositories.specifications.ProductSpecifications;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
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

    public void deleteById(Long id) {productRepository.deleteById(id);}

    public List<Product> getAllByPriceBetween(Integer min, Integer max) {return productRepository.findAllByPriceBetween(min, max);}

    public List<Product> getAllCheaperThen(Integer priceMax) {return productRepository.findAllCheaperThen(priceMax);}

    public  Product save(Product product) {
        return productRepository.save(product);
    }
    public Page<Product> get(Integer minPrice, Integer maxPrice, String partTitle, Integer page) {
        Specification<Product> spec =  Specification.where(null);
        if (minPrice != null) {
            spec = spec.and(ProductSpecifications.priceGeraterOrEquals(minPrice));
        }
        if (maxPrice != null) {
            spec = spec.and(ProductSpecifications.priceLessOrEquals(maxPrice));
        }
        if (partTitle != null) {
            spec = spec.and(ProductSpecifications.titleLike(partTitle));
        }
        return productRepository.findAll(spec, PageRequest.of(page - 1, 5));
     }
}
