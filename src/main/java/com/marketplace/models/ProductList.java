package com.marketplace.models;

import java.util.ArrayList;

public class ProductList {
    private static ProductList instance;
    private ArrayList<Product> products;

    private ProductList() {
        this.products = new ArrayList<Product>();
        // this.loadData("./data/products.csv");
    };

    protected void handleParts(String[] parts) {
        if (parts.length == 6) {

        }
    }

    public static synchronized ProductList getInstance() {
        if (instance == null)
            instance = new ProductList();

        return instance;
    }

}