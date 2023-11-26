package com.marketplace;

// import java.util.HashMap;
// import java.util.Iterator;

// import com.marketplace.controllers.ChatController;
// import com.marketplace.models.Chat;
// import com.marketplace.models.Message;
// import com.marketplace.models.Session;
// import com.marketplace.models.User;
// import com.marketplace.models.UserList;
import com.marketplace.views.Home;

public class Main {
    public static void main(String[] args) {
        // UserList userList = UserList.getInstance();
        // Session session = Session.getInstance();

        // User user = userList.findById(2);
        // User currentUser = session.getCurrentUser();

        // ChatController chatController = new ChatController();

        // if (chatController.getChats().size() == 0)
        // System.out.println("Chats vazio, correto!");

        // Chat chat = chatController.createChat(2);

        // if (chat.userParticipateChat(currentUser) && chat.userParticipateChat(user))
        // System.out.println("Ambos participam!");

        // if (chatController.getChats().size() == 1)
        // System.out.println("Chats 1, correto!");

        // if (user.getChats().size() == 1 && currentUser.getChats().size() == 1);
        // System.out.println("AMBOS CORRETOS");

        // if (chatController.getChat(chat.getId()).getId() == chat.getId())
        // System.out.println("yes");

        // HashMap<String, Object> result = chatController.sendMessage("Oi tudo bem?",
        // chat);

        // if(result.get("chat") != null)
        // System.out.println("Tudo ok!");

        // Iterator<Message> iterator =
        // currentUser.getChats().findById(chat.getId()).getMessages().iterator();

        // while (iterator.hasNext()) {
        // Message message = iterator.next();

        // if (message.getSender().getId() == currentUser.getId())
        // System.out.println("sender correto!");
        // if (message.getReceiver().getId() == user.getId())
        // System.out.println("receiver correto!");
        // System.out.println(message.getMessage());
        // }

        Home homeScreen = new Home();
        homeScreen.showOptions();
        homeScreen.listenCommand();
    }
}