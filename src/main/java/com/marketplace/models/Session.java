package com.marketplace.models;

public class Session {
    private static Session instance;

    private Session() {
    };

    public static synchronized Session getInstance() {
        if (instance == null)
            instance = new Session();
        return instance;
    }
}