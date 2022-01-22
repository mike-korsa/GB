package com.company.java2.lesson1.person.customer;

import com.company.java2.lesson1.product.Product;
import com.company.java2.lesson1.market.Market;
import com.company.java2.lesson1.person.Person;
import com.company.java2.lesson1.person.seller.Seller;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private List<Product> expectedPurchaseList;
    private List<Product> purchaseList;

    public Customer(List<Product> expectedPurchaseList, int cash) {
        this.purchaseList = new ArrayList<>();
        this.expectedPurchaseList = expectedPurchaseList;
        this.setCash(cash);
    }

    public void addPurchase(Product product) {
        if (purchaseList == null) {
            purchaseList = new ArrayList<>();
        }

        purchaseList.add(product);
    }

    public void findProductOnMarket(Market market, String name, String lastName) {
        List<Product> li = new ArrayList<>(getExpectedPurchaseList());
        for (Product product : li) {
            for (Seller seller : market.getSellers()) {
                if (seller.getName().equals(name) && seller.getLastName().equals(lastName)) {
                    boolean isBought = seller.sellProducts(this, product);
                    if (isBought) {
                        expectedPurchaseList.remove(product);
                        break;
                    }
                }
            }
        }
    }

    public void info() {
        StringBuilder result = new StringBuilder("Я купил ");
        if (purchaseList.size() == 0) {
            result.append("ничего");
        } else {
            for(Product product: purchaseList) {
                result.append(product.getName());
                result.append(" в количестве ");
                result.append(product.getQuantity());
                result.append(", ");
            }
        }

        result.append(". У меня осталось: ");
        result.append(getCash());
        result.append(" рублей");

        System.out.println(result);
    }

    public List<Product> getExpectedPurchaseList() {
        return expectedPurchaseList;
    }

    public List<Product> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<Product> purchaseList) {
        this.purchaseList = purchaseList;
    }

}
