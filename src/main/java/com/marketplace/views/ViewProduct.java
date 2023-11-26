package com.marketplace.views;

import java.util.HashMap;
import java.util.Map;

import com.marketplace.controllers.ProductController;
import com.marketplace.models.Product;
import com.marketplace.utils.InputReader;

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
        InputReader reader = new InputReader(this.keyboard);
        HashMap<String, Object> result;
        String comment;
        float rating = -1.0f;

        while ((Float.compare(rating, 0f) < 0) || (Float.compare(rating, 5f) > 0))
            rating = reader.readFloat("Avaliação");

        comment = reader.readString("Comentario");
        result = this.productController.rate(rating, comment, this.product);

        Product temp = (Product) result.get("product");
        if (temp == null) {
            System.out.println("Não foi possivel Avaliar o produto");
            for (Map.Entry<String, Object> entry : result.entrySet())
                System.out.println(entry.getValue());
        }

        System.out.println("");
        this.product.showDetails();
        this.showOptions();
    }

    private void reportProduct() {

    }

    private void showProduct() {
        this.product.showDetails();
    }
}
