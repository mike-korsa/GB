package com.company.repositories;

import com.company.entites.Product;

import java.util.List;

public class ProductRepository {
    List<Product> products;
    public Product getById(int id) {
        for (Product p: this.products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
        /*Product p = new Product();
        p.setId(id);
        p.setTitle("Product" + id);
        p.setCost(10 + id);
        return p;*/
    }

    public List<Product> getAll () {
        return this.products;
    }

}
