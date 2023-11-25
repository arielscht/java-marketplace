package com.marketplace.models;

import javax.json.JsonObject;

public class Location {
    private String street;
    private String neighborhood;
    private int number;
    private String city;
    private String state;

    public Location(String street, String neighborhood, int number, String city, String state) {
        this.street = street;
        this.neighborhood = neighborhood;
        this.number = number;
        this.city = city;
        this.state = state;
    };

    public static Location jsonToObject(JsonObject jsonObject){
        String street = jsonObject.getString("street");
        String neighborhood = jsonObject.getString("neighborhood");
        int number = jsonObject.getInt("number");
        String city = jsonObject.getString("city");
        String state = jsonObject.getString("state");

        Location location = new Location(street, neighborhood, number, city, state);

        return location;
    }
}
