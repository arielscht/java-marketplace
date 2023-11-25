package com.marketplace.models;

import java.util.ArrayList;
import java.util.Iterator;

import javax.json.JsonObject;

import com.marketplace.interfaces.Searchable;

public class CategoriesList extends Loadable implements Searchable<Category> {
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

    public Category findById(int id){
        boolean found = false;
        Iterator<Category> iterator = categories.iterator();
        Category category = null;

        while (!found && iterator.hasNext()) {
            Category currentCategory = iterator.next();

            if (currentCategory.getId() == id){
                category = currentCategory;
                found = true;
            }
        }

        return category;
    }
}