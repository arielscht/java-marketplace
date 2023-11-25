package com.marketplace.models;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean admin;

    public User(int id, String firstName, String lastName, String email, boolean admin) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.admin = admin;
    }

    public int getId() {
        return this.id;
    }

    public String toString(int level) {
        String tabbing = "\n";

        for (int i = 0; i < level; ++i)
            tabbing += "\t";

        String result = tabbing + "id: " + this.id +
                tabbing + "name: " + this.firstName + " " + this.lastName +
                tabbing + "email: " + this.email +
                tabbing + "admin: " + this.admin;

        return result;
    }
}