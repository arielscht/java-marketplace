package com.marketplace.models;

import java.util.ArrayList;

import javax.json.JsonObject;

public class CategoriesList extends Loadable {
    private static CategoriesList instance;
    private ArrayList<Category> categories;

    private CategoriesList() {
        this.categories = new ArrayList<Category>();
        this.loadData("src/main/java/com/marketplace/data/categories.json");
    }

    protected void handleJson(JsonObject jsonCategory) {
        int id = jsonCategory.getInt("id");
        String categoryName = jsonCategory.getString("name");
        Category category = new Category(id, categoryName);

        categories.add(category);
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