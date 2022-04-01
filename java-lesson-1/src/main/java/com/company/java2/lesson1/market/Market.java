package com.company.java2.lesson1.market;

import com.company.java2.lesson1.person.seller.Seller;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private List<Seller> sellers;

    public List<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(List<Seller> sellers) {
        this.sellers = sellers;
    }

    public void addSeller(Seller seller) {
        if(sellers == null) {
            sellers = new ArrayList<>();
        }

        sellers.add(seller);
    }
}
