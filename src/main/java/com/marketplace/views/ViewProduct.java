package com.marketplace.views;

import com.marketplace.controllers.ProductController;
import com.marketplace.models.Product;

public class ViewProduct extends Interface {
    private ProductController productController;
    private Product product;

    public ViewProduct(Product product) {
        this.numberOfOptions = 3;

        this.productController = new ProductController();
        this.product = product;

        this.showProduct();
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

    private void showProduct() {
        this.product.showDetails();
    }
}
