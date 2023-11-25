package com.marketplace.models;

public class Rating {
    private User user;
    private float rating;
    private String comment;

    public Rating(User user, float rating, String comment) {
        this.user = user;
        this.rating = rating;
        this.comment = comment;
    }
}
