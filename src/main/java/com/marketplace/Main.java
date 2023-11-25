package com.marketplace;

import com.marketplace.models.Product;
import com.marketplace.models.ProductList;
import com.marketplace.views.Home;

public class Main {
    public static void main(String[] args) {
        ProductList productList = ProductList.getInstance();
        Product product = productList.findById(1);

        System.out.println(product);



        // Home homeScreen = new Home();
        // homeScreen.showOptions();
        // homeScreen.listenCommand();
    }
}