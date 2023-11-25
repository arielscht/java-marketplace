package com.marketplace.views;

import java.util.Scanner;

public abstract class Interface {
    protected int numberOfOptions;

    private int readCommand(Scanner keyboard) {
        int option = -1;

        System.out.print("Opção: ");

        if (keyboard.hasNextInt()) {
            option = keyboard.nextInt();
        }

        return option;
    }

    private boolean checkOption(int option) {
        boolean isValid = option >= 1 && option <= this.numberOfOptions;

        if (!isValid) {
            System.out.println("OPÇÃO INVÁLIDA: Selecione novamente.\n");
        }

        return isValid;
    }

    private boolean isExit(int option) {
        return option == this.numberOfOptions;
    }

    public void listenCommand() {
        int option;
        boolean isValid;
        Scanner keyboard = new Scanner(System.in);

        option = this.readCommand(keyboard);

        while (!this.isExit(option)) {
            isValid = this.checkOption(option);

            if (isValid)
                this.handleOption(option);

            option = this.readCommand(keyboard);
        }
    }

    public abstract void showOptions();

    public abstract void handleOption(int option);

}
