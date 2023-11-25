package com.marketplace.views;

import java.util.ArrayList;
import java.util.Iterator;

import com.marketplace.controllers.ProductController;
import com.marketplace.models.Product;

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
        ProductController controller = new ProductController();

        ArrayList<Product> products = controller.search();
        Iterator<Product> iterator = products.iterator();

        System.out.println("\nPRODUTOS:\n");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.print("\n");
        }
    }

    private void filterProducts() {

    }

    private void showProduct() {

    }
}
