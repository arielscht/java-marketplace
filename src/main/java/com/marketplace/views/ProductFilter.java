package com.marketplace.views;

import java.util.ArrayList;
import java.util.Iterator;

import com.marketplace.controllers.ProductController;
import com.marketplace.models.Product;

import com.marketplace.models.CategoriesList;
import com.marketplace.models.Category;

public class ProductFilter extends Interface {
    private ProductController productController;
    private String name;
    private int categoryId;
    private float upperBoundPrice;
    private float lowerBoundPrice;

    public ProductFilter() {
        this.numberOfOptions = 6;
        this.productController = new ProductController();
        this.clearFilters();
    }

    public void showOptions() {
        System.out.println("\nFiltros: ");
        System.out.println("1 - Nome");
        System.out.println("2 - Categoria");
        System.out.println("3 - Preço");
        System.out.println("4 - Limpar Filtros");
        System.out.println("5 - Efetuar Filtro");
        System.out.println("6 - Voltar\n");
    }

    public void handleOption(int option) {
        switch (option) {
            case 1:
                this.readName();
                break;
            case 2:
                this.readCategory();
                break;
            case 3:
                this.readPrice();
                break;
            case 4:
                this.clearFilters();
                this.showOptions();
                break;
            case 5:
                this.filter();
                break;
            default:
                break;
        }

    }

    private void readName() {
        String nameInput = "";

        System.out.print("Nome: ");
        if (this.keyboard.hasNext()) {
            nameInput = this.keyboard.next();
            this.keyboard.nextLine();
        }

        this.name = nameInput;

        this.showOptions();
    }

    private void readCategory() {
        CategoriesList categoryList = CategoriesList.getInstance();
        ArrayList<Category> categories = categoryList.getCategories();

        System.out.println("\nCategorias Disponíveis: ");
        Iterator<Category> iterator = categories.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().toString(1));

        Category categoryObj = null;

        while (categoryObj == null) {
            System.out.print("\nEscolha a Categoria: ");
            categoryObj = categoryList.findById(this.keyboard.nextInt());

            if (categoryObj == null)
                System.out.println("CATEGORIA INVÁLIDA. Escolha novamente.");
        }

        this.categoryId = categoryObj.getId();

        this.showOptions();
    }

    private void readPrice() {
        float lowerBound = -1;
        float upperBound = -1;

        System.out.println("Faixa de preço: \n");

        System.out.print("De: ");
        if (this.keyboard.hasNextFloat())
            lowerBound = this.keyboard.nextFloat();

        System.out.print("Até: ");
        if (this.keyboard.hasNextFloat())
            upperBound = this.keyboard.nextFloat();

        this.lowerBoundPrice = lowerBound;
        this.upperBoundPrice = upperBound;

        this.showOptions();
    }

    private void clearFilters() {
        this.name = "";
        this.categoryId = -1;
        this.upperBoundPrice = -1;
        this.lowerBoundPrice = -1;
    }

    private void filter() {
        ArrayList<Product> products = this.productController.filter(this.name, this.categoryId, this.lowerBoundPrice,
                this.upperBoundPrice);

        System.out.println("\nPRODUTOS:\n");
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.print("\n");
        }

        this.showOptions();
    }
}
