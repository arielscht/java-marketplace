package com.marketplace;

import java.util.ArrayList;
import java.util.Iterator;

import com.marketplace.models.Product;
import com.marketplace.controllers.ProductController;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();

        ArrayList<Product> filteredProducts = productController.filter("", -1, -1, 20f);

        Iterator<Product> iterator = filteredProducts.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}