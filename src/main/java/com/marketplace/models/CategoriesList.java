package com.marketplace.models;

import java.util.ArrayList;

public class CategoriesList extends Loadable {
    private static CategoriesList instance;
    private ArrayList<Category> categories;

    private CategoriesList() {
        this.categories = new ArrayList<Category>();
        this.loadData("src/main/java/com/marketplace/data/categories.csv");
    }

    protected void handleParts(String[] parts) {
        if (parts.length == 2) {
            int id = Integer.parseInt(parts[0].trim());
            String name = parts[1].trim();

            Category category = new Category(id, name);
            categories.add(category);
        }
    }

    public static synchronized CategoriesList getInstance() {
        if (instance == null)
            instance = new CategoriesList();

        return instance;
    }

    public ArrayList<Category> getCategories() {
        return this.categories;
    }
}