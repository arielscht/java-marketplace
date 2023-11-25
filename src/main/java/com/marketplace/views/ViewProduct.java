package com.marketplace.views;

public class ViewProduct extends Interface {
    public ViewProduct() {
        this.numberOfOptions = 3;
    }

    public void showOptions() {
        System.out.println("\nProduto");
        System.out.println("1 - Avaliar Produto");
        System.out.println("2 - Denunciar Produto");
        System.out.println("3 - Voltar\n");
    }

    public void handleOption(int option) {
        switch (option) {
            case 1:
                this.rateProduct();
                break;
            case 2:
                this.reportProduct();
                break;
            default:
                break;
        }
    }

    private void rateProduct() {

    }

    private void reportProduct() {

    }
}
