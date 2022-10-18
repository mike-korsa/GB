package com.company.controllers;

import com.company.dto.ProductDto;
import com.company.entities.Product;
import com.company.services.ProductService;
import org.springframework.data.domain.Page;
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
    public Page<ProductDto> getAllProducts(
            @RequestParam(name = "p", defaultValue = "1") Integer page,
            @RequestParam(name = "min_price", required = false ) Integer minPrice,
            @RequestParam(name = "max_price", required = false) Integer maxPrice,
            @RequestParam(name = "name_part", required = false) String namePart
    ) {
        if (page < 1) {
            page = 1 ;
        }
            return productService.get(minPrice, maxPrice, namePart, page).map(p-> new ProductDto(p));

    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable long id) {return productService.getById(id).get(); }

    @PostMapping
    public Product saveNewProduct(@RequestBody ProductDto product) {
        product.setId(null);
        return productService.save(new Product(product.getId(), product.getTitle(), product.getPrice()));
    }

    @PutMapping
    public Product updateProduct(@RequestBody ProductDto product) {
        return productService.save(new Product(product.getId(), product.getTitle(), product.getPrice()));
    }

    @DeleteMapping("/{id}")
    public void  deleteProductById(@PathVariable long id) {productService.deleteById(id); }
}
