package com.marketplace.models;

import java.util.ArrayList;
import java.util.Iterator;

import javax.json.JsonObject;

import com.marketplace.interfaces.Searchable;

public class UserList extends Loadable implements Searchable<User> {
    private static UserList instance;
    private ArrayList<User> users;

    private UserList(){
        this.users = new ArrayList<User>();
        this.loadData("src/main/java/com/marketplace/data/users.json");
    }

    protected void handleJson(JsonObject jsonUser){
        int id = jsonUser.getInt("id");
        String firstName = jsonUser.getString("firstName");
        String lastName = jsonUser.getString("lastName");
        String email = jsonUser.getString("email");
        boolean admin = jsonUser.getBoolean("admin");

        User user = new User(id, firstName, lastName, email, admin);

        this.users.add(user);
    }

    public static synchronized UserList getInstance() {
        if (instance == null)
            instance = new UserList();

        return instance;
    }

    public User findById(int id) {
        boolean found = false;
        Iterator<User> iterator = users.iterator();
        User user = null;

        while (!found && iterator.hasNext()) {
            User currentUser = iterator.next();

            if (currentUser.getId() == id){
                user = currentUser;
                found = true;
            }
        }

        return user;
    }
}