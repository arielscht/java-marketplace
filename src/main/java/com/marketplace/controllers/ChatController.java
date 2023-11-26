package com.marketplace.controllers;

import java.util.ArrayList;
import java.util.Iterator;

import com.marketplace.models.Chat;
import com.marketplace.models.Message;
import com.marketplace.models.MessageList;
import com.marketplace.models.Session;
import com.marketplace.models.User;
import com.marketplace.models.UserList;

public class ChatController {

    public Chat createChat(int userId){
        Session session = Session.getInstance();
        UserList userList = UserList.getInstance();

        User user = userList.findById(userId);
        User currentUser = session.getCurrentUser();

        Chat chat = new Chat(user, currentUser, new MessageList());

        user.addChat(chat);
        currentUser.addChat(chat);

        return chat;
    }

    public void sendMessage(String message, Chat chat){
        chat.sendMessage(message);
    }

    public Chat getChat(int chatId){
        Session session = Session.getInstance();
        User currentUser = session.getCurrentUser();

        return currentUser.getChats().findById(chatId);
    }
}
