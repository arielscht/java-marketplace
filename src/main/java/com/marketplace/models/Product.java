package com.marketplace.models;

import com.marketplace.enums.StateType;

public class Product {
    private int id;
    private String name;
    private String description;
    private float price;
    private StateType state;
    private float generalRating;
    private ImageList images;
    private RatingList ratings;
    private PaymentMethodList paymentMethods;
    private Category category;
    private Location location;
    private User user;

    public Product(int id, String name, String description, float price, ImageList images, RatingList ratings, PaymentMethodList paymentMethods, Category category, User user, StateType state, Location location, float generalRating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.images = images;
        this.ratings = ratings;
        this.paymentMethods = paymentMethods;
        this.category = category;
        this.user = user;
        this.state = state;
        this.location = location;
        this.generalRating = generalRating;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }

    public Category getCategory() {
        return this.category;
    }

    @Override
    public String toString() {
        String result = "id: " + this.id +
                "\nname: " + this.name +
                "\ndescription: " + this.description +
                "\nprice: " + this.price +
                "\ncategory: " + this.category.toString(1) +
                "\nuser: " + this.user.toString(1) +
                "\nstate: " + this.state +
                "\nlocation: " + this.location.toString(1) +
                "\ngeneralRating: " + this.generalRating;

        return result;
    }
}
