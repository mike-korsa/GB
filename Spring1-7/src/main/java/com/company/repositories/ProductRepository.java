package com.company.repositories;

import com.company.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> , JpaSpecificationExecutor<Product> {

    List<Product> findAllByPriceBetween(Integer min, Integer max);

    @Query(value = "select * from products where price < : maxPrice", nativeQuery = true)
    List<Product> findAllCheaperThen(Integer maxPrice);
}
