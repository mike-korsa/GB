package com.company.controllers;

import com.company.dto.ProductDto;
import com.company.entities.Product;
import com.company.services.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ProductDto saveNewProduct(@RequestBody ProductDto product) {
        product.setId(null);
        Product p = productService.save(new Product(product.getTitle(), product.getPrice()));
        product.setId(p.getId());
        return product;
    }

    @PutMapping
    public ProductDto updateProduct(@RequestBody ProductDto product) {
        //Optional<Product> p = productService.getById(product.getId()).get();
        Product p = productService.getById(product.getId()).get();
        p.setPrice(product.getPrice());
        p.setTitle(product.getTitle());
        productService.save(p);
        return product;
    }

    @DeleteMapping("/{id}")
    public void  deleteProductById(@PathVariable long id) {productService.deleteById(id); }
}
