package com.company.controllers;

import com.company.entities.Product;
import com.company.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> getAllProducts() {return productService.getAll(); }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable long id) {return productService.getById(id).get(); }

    @RequestMapping(value = "/products/delete/{id}", method = RequestMethod.GET)
    public void  deleteProductById(@PathVariable long id) {productService.deleteById(id); }

    @RequestMapping(value = "/products/price_range", method = RequestMethod.GET)
    public List<Product> findAllProductsByPriceBetween(@RequestParam Integer min,@RequestParam Integer max) {
        return productService.getAllByPriceBetween(min, max);
    }
}
