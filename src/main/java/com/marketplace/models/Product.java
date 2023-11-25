package com.marketplace.models;

import java.util.ArrayList;

public class Product {
    private int id;
    private String name;
    private String description;
    private float price;
    private ArrayList<Image> images;
    private RatingList ratings;
    private Category category;
    private String state;
    private Location location;
    private float rating;

    public Product(String name, String description, float price, String state, float rating) {
        this.name = name;
        this.description = name;
        this.price = price;
        this.state = state;
        this.rating = rating;
    }
}
