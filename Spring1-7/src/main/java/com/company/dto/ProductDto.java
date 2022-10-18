package com.company.dto;

import com.company.entities.Customer;
import com.company.entities.Product;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

public class ProductDto {
    Long id;
    String title;
    int price;

    public ProductDto() {

    }

    public ProductDto(Product product) {
        this.price = product.getPrice();
        this.title = product.getTitle();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
