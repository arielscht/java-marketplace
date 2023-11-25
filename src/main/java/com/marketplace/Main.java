package com.marketplace;

import com.marketplace.models.Product;
import com.marketplace.models.ProductList;

public class Main {
    public static void main(String[] args) {
        ProductList productList = ProductList.getInstance();

        Product product = productList.findById(2);

        System.out.println(product);
    }
}