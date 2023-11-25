package com.marketplace.views;

public class Explore extends Interface {

    public Explore() {
        this.numberOfOptions = 4;
    }

    public void showOptions() {
        System.out.println("\nExplorar");
        System.out.println("1 - Listar Produtos");
        System.out.println("2 - Filtrar Produtos");
        System.out.println("3 - Ver Produto");
        System.out.println("4 - Voltar\n");
    }

    public void handleOption(int option) {
        switch (option) {
            case 1:
                this.listProducts();
                break;
            case 2:
                this.filterProducts();
                break;
            case 3:
                this.showProduct();
                break;
            default:
                break;
        }
    }

    private void listProducts() {

    }

    private void filterProducts() {

    }

    private void showProduct() {

    }
}
