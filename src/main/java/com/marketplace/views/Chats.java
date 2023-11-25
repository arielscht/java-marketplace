package com.marketplace.views;

public class Chats extends Interface {
    public Chats() {
        this.numberOfOptions = 3;
    }

    public void showOptions() {
        System.out.println("\nConversas");
        System.out.println("1 - Listar Conversas");
        System.out.println("2 - Abrir Conversa");
        System.out.println("3 - Voltar\n");
    }

    public void handleOption(int option) {
        switch (option) {
            case 1:
                this.listChats();
                break;
            case 2:
                this.showChat();
                break;
            default:
                break;
        }
    }

    private void listChats() {

    }

    private void showChat() {

    }
}
