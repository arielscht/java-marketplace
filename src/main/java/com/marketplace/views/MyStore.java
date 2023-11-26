package com.marketplace.views;

public class MyStore extends Interface {
    public MyStore() {
        this.numberOfOptions = 3;
    }

    public void showOptions() {
        System.out.println("\nMinha Loja");
        System.out.println("1 - Meus Produtos");
        System.out.println("2 - Adicionar Produtos");
        System.out.println("3 - Voltar\n");
    }

    public void handleOption(int option) {
        switch (option) {
            case 1:
                this.showProducts();
                break;
            case 2:
                this.addProduct();
                break;
            default:
                break;
        }
    }

    private void showProducts() {

    }

    private void addProduct() {
        CreateProduct createProductScreen = new CreateProduct();

        createProductScreen.showOptions();
        createProductScreen.listenCommand();

        this.showOptions();
    }
}