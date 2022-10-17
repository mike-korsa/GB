package com.company.controllers;

import com.company.entities.Product;
import com.company.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/products")
@RestController
public class ProductControllerRest {
    private ProductService productService;

    public ProductControllerRest(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(
            @RequestParam(name = "p", defaultValue = "1") Long page,
            @RequestParam(name = "min_price", defaultValue = "0") Integer minPrice,
            @RequestParam(name = "max_praic", required = false) Integer maxPrice
    ) {return productService.getAll(); }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable long id) {return productService.getById(id).get(); }

    @DeleteMapping("/{id}")
    public void  deleteProductById(@PathVariable long id) {productService.deleteById(id); }

    @RequestMapping(value = "/products/price_range", method = RequestMethod.GET)
    public List<Product> findAllProductsByPriceBetween(@RequestParam Integer min,@RequestParam Integer max) {
        return productService.getAllByPriceBetween(min, max);
    }
}
