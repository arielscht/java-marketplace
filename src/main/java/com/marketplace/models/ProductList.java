package com.marketplace.models;

import java.util.ArrayList;
import java.util.Iterator;

import javax.json.JsonArray;
import javax.json.JsonObject;

import com.marketplace.models.interfaces.Searchable;

public class ProductList extends Loadable implements Searchable<Product>{
    private static ProductList instance;
    private ArrayList<Product> products;

    private ProductList() {
        this.products = new ArrayList<Product>();
        this.loadData("src/main/java/com/marketplace/data/products.json");
    };

    protected void handleJson(JsonObject jsonProduct) {
        int id = jsonProduct.getInt("id");
        String name = jsonProduct.getString("name");
        String description = jsonProduct.getString("description");
        float price = jsonProduct.getJsonNumber("price").numberValue().floatValue();
        JsonArray jsonImage = jsonProduct.getJsonArray("images");
        JsonArray jsonRating = jsonProduct.getJsonArray("ratings");
        int categoryId = jsonProduct.getInt("categoryId");
        int userId = jsonProduct.getInt("userId");
        String state = jsonProduct.getString("state");
        JsonObject jsonLocation = jsonProduct.getJsonObject("location");
        float generalRating = jsonProduct.getJsonNumber("generalRating").numberValue().floatValue();

        ImageList images = ImageList.jsonToList(jsonImage);

        RatingList ratings = RatingList.jsonToList(jsonRating);

        CategoriesList categories = CategoriesList.getInstance();
        Category category = categories.findById(categoryId);

        UserList users = UserList.getInstance();
        User user = users.findById(userId);

        Location location = Location.jsonToObject(jsonLocation);

        Product product = new Product(id, name, description, price, images, ratings, category, user, state, location, generalRating);

        products.add(product);
    }

    public static synchronized ProductList getInstance() {
        if (instance == null)
            instance = new ProductList();

        return instance;
    }

    @Override
    public Product findById(int id) {
        boolean found = false;
        Iterator<Product> iterator = products.iterator();
        Product product = null;

        while (!found && iterator.hasNext()) {
            Product currentProduct = iterator.next();

            if (currentProduct.getId() == id){
                product = currentProduct;
                found = true;
            }
        }

        return product;
    }

}