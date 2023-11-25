package com.marketplace.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import com.marketplace.models.ProductList;
import com.marketplace.models.Product;

public class ProductController {
    public ArrayList<Product> search() {
        ProductList list = ProductList.getInstance();
        return list.getProducts();
    }

    public ArrayList<Product> filter(String name, int categoryId, float lowerPriceBound, float upperPriceBound) {
        ProductList list = ProductList.getInstance();
        HashMap<String, Object> filters = new HashMap<String, Object>();

        if (name.length() != 0) filters.put("name", name);
        if (categoryId != -1) filters.put("categoryId", categoryId);
        if (lowerPriceBound != -1) filters.put("lowerPriceBound", lowerPriceBound);
        if (upperPriceBound != -1) filters.put("upperPriceBound", upperPriceBound);

        return list.filter(filters);
    }
}