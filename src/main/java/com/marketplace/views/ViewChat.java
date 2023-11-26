package com.marketplace.views;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import com.marketplace.controllers.ChatController;
import com.marketplace.models.Chat;
import com.marketplace.models.MessageList;
import com.marketplace.utils.InputReader;
import com.marketplace.models.Message;

public class ViewChat extends Interface {
    private ChatController chatController;
    private Chat chat;

    public ViewChat(Chat chat) {
        this.numberOfOptions = 3;

        this.chatController = new ChatController();
        this.chat = chat;
    }

    public void showOptions() {
        System.out.println("\nConversa");
        System.out.println("1 - Ver Mensagens");
        System.out.println("2 - Enviar Mensagem");
        System.out.println("3 - Voltar\n");

        this.listenCommand();
    }

    public void handleOption(int option) {
        switch (option) {
            case 1:
                this.showMessages();
                break;
            case 2:
                this.sendMessage();
                break;
            default:
                break;
        }
    }

    private void showMessages() {
        MessageList messages = this.chat.getMessages();

        System.out.println("CONVERSA: ");
        Iterator<Message> iterator = messages.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next().toString(1));

        this.showOptions();
    }

    private void sendMessage() {
        InputReader reader = new InputReader(this.keyboard);
        HashMap<String, Object> result;
        String message = "";

        message = reader.readString("Mensagem");

        result = this.chatController.sendMessage(message, this.chat);

        Chat temp = (Chat) result.get("chat");
        if (temp == null) {
            System.out.println("Não foi possivel enviar a mensagem");
            for (Map.Entry<String, Object> entry : result.entrySet())
                System.out.println(entry.getValue());
        }
        this.showOptions();
    }
}
