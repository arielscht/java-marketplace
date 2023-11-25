package com.marketplace;

import java.util.ArrayList;

import com.marketplace.models.CategoriesList;
import com.marketplace.models.Category;

public class Main {
    public static void main(String[] args) {
        CategoriesList categoriesList = CategoriesList.getInstance();
        ArrayList<Category> categories = categoriesList.getCategories();

        for (Category category : categories) {
            System.out.println("Category Name: " + category.getName());
        }
    }
}