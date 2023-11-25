package com.marketplace.models;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String photo;
    private boolean admin;

    public User(int id, String firstName, String lastName, String email, String photo, boolean admin){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.photo = photo;
        this.admin = admin;
    }

    public int getId(){
        return this.id;
    }
}