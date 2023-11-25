package com.marketplace.models;

import java.util.ArrayList;

import javax.json.JsonArray;
import javax.json.JsonObject;

public class RatingList extends ArrayList<Rating> {

    public static RatingList jsonToList(JsonArray jsonArray){
        RatingList ratingList = new RatingList();

        for (JsonObject jsonRating : jsonArray.getValuesAs(JsonObject.class)){
            float ratingValue = jsonRating.getJsonNumber("rating").numberValue().floatValue();
            String comment = jsonRating.getString("comment");

            Rating rating = new Rating(ratingValue, comment);
            ratingList.add(rating);
        }

        return ratingList;
    }
}