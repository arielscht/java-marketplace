package com.marketplace.views;

import java.util.ArrayList;
import java.util.Iterator;

import com.marketplace.controllers.ChatController;
import com.marketplace.models.Chat;
import com.marketplace.models.User;
import com.marketplace.models.UserList;

public class Chats extends Interface {
    private ChatController chatController;

    public Chats() {
        this.numberOfOptions = 4;

        this.chatController = new ChatController();
    }

    public void showOptions() {
        System.out.println("\nConversas");
        System.out.println("1 - Listar Conversas");
        System.out.println("2 - Criar Conversa");
        System.out.println("3 - Abrir Conversa");
        System.out.println("4 - Voltar\n");
    }

    public void handleOption(int option) {
        switch (option) {
            case 1:
                this.listChats();
                break;
            case 2:
                this.createChat();
                break;
            case 3:
                this.showChat();
                break;
            default:
                break;
        }
    }

    private void listChats() {
        ArrayList<Chat> chatList = this.chatController.getChats();

        System.out.println("CONVERSAS: ");
        Iterator<Chat> iterator = chatList.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next().toString(1));

        this.showOptions();
    }

    private void createChat() {
        UserList userList = UserList.getInstance();
        User receiver = null;
        Chat chat = null;

        while (receiver == null || chat == null) {
            System.out.print("\nID do usuário: ");
            receiver = userList.findById(this.keyboard.nextInt());

            if (receiver == null)
                System.out.println("USUÁRIO INVÁLIDO. Escolha novamente.");
            else {
                chat = this.chatController.createChat(receiver.getId());
                if (chat == null)
                    System.out.println("Não é possível criar um chat consigo mesmo");
            }
        }

        System.out.println("Chat criado com sucesso!");
        this.showOptions();
    }

    private void showChat() {
        Chat chatObj = null;

        while (chatObj == null) {
            System.out.print("\nID do chat: ");
            chatObj = this.chatController.getChat(this.keyboard.nextInt());
            if (chatObj == null)
                System.out.println("CHAT INVÁLIDO. Escolha novamente.");
        }

        ViewChat viewChatScreen = new ViewChat(chatObj);

        viewChatScreen.showOptions();
        viewChatScreen.listenCommand();

        this.showOptions();
    }
}
