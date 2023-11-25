package com.marketplace.models;

public class Product {
    private int id;
    private String name;
    private String description;
    private float price;
    private ImageList images;
    private RatingList ratings;
    private Category category;
    private User user;
    private String state;
    private Location location;
    private float generalRating;

    public Product(int id, String name, String description, float price, ImageList images, RatingList ratings, Category category, User user, String state, Location location, float generalRating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.images = images;
        this.ratings = ratings;
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
                        "\ncategory: " + this.category.toString() +
                        "\nuser: " + this.user.toString() +
                        "\nstate: " + this.state +
                        "\nlocation: " + this.location.toString() +
                        "\ngeneralRating: " + this.generalRating;

        return result;
    }
}
