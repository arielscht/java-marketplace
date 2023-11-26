package com.marketplace.models;

public class Message {
    private User sender;
    private User receiver;
    private String message;

    public Message(User sender, User receiver, String message){
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public User getSender(){
        return this.sender;
    }

    public User getReceiver(){
        return this.receiver;
    }
}