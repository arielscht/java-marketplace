package com.marketplace.models;

public class User {
    private static int nextId = 1;

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String photo;
    private boolean admin;
    private ChatList chats;

    public User(String firstName, String lastName, String email, String photo, boolean admin, ChatList chats) {
        this.id = User.nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.photo = photo;
        this.admin = admin;
        this.chats = chats;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public ChatList getChats(){
        return this.chats;
    }

    public void addChat(Chat chat){
        this.chats.add(chat);
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