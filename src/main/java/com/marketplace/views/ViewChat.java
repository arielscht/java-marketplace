package com.marketplace.views;

public class ViewChat extends Interface {
    public ViewChat() {
        this.numberOfOptions = 3;
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

    }

    private void sendMessage() {

    }
}
