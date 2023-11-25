package com.marketplace.views;

import java.util.ArrayList;
import java.util.Iterator;

import com.marketplace.controllers.ProductController;
import com.marketplace.models.Product;

public class Explore extends Interface {
    private ProductController productController;

    public Explore() {
        this.numberOfOptions = 4;
        this.productController = new ProductController();
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
        ArrayList<Product> products = this.productController.search();

        System.out.println("\nPRODUTOS:\n");
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.print("\n");
        }

        this.showOptions();
    }

    private void filterProducts() {
        ProductFilter productFilterScreen = new ProductFilter();

        productFilterScreen.showOptions();
        productFilterScreen.listenCommand();

        this.showOptions();
    }

    private void showProduct() {

    }
}
