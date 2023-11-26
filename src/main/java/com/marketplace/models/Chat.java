package com.marketplace.models;

import java.util.ArrayList;
import java.util.Iterator;

public class Chat {
    private static int nextId = 1;

    private int id;
    private ArrayList<User> users;
    private MessageList messages;

    public Chat(User userOne, User userTwo, MessageList messages){
        this.id = nextId++;
        this.users.add(userOne);
        this.users.add(userTwo);
        this.messages = messages;
    }

    public int getId(){
        return this.id;
    }

    public ArrayList<User> getUsers(){
        return this.users;
    }

    public void sendMessage(String message){
        Session session = Session.getInstance();

        User sender = session.getCurrentUser();
        User receiver = fetchReceiver();

        Message messageObj = new Message(sender, receiver, message);

        this.messages.add(messageObj);
    }

    private User fetchReceiver(){
        Session session = Session.getInstance();
        User sender = session.getCurrentUser();

        boolean found = false;
        User receiver = null;

        ArrayList<User> users = this.getUsers();
        Iterator<User> iterator = users.iterator();

        while (!found && iterator.hasNext()) {
            User user = iterator.next();

            if (user.getId() != sender.getId()){
                receiver = user;
                found = true;
            }
        }

        return receiver;
    }
}