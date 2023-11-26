package com.marketplace.models;

import java.util.Iterator;

import com.marketplace.enums.StateType;

public class Product {
    private int id;
    private String name;
    private String description;
    private float price;
    private StateType state;
    private float generalRating;
    private ImageList images;
    private RatingList ratings;
    private PaymentMethodList paymentMethods;
    private Category category;
    private Location location;
    private User user;

    public Product(int id, String name, String description, float price, ImageList images, RatingList ratings,
            PaymentMethodList paymentMethods, Category category, User user, StateType state, Location location,
            float generalRating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.images = images;
        this.ratings = ratings;
        this.paymentMethods = paymentMethods;
        this.category = category;
        this.user = user;
        this.state = state;
        this.location = location;
        this.generalRating = generalRating;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }

    public Category getCategory() {
        return this.category;
    }

    @Override
    public String toString() {
        String result = "id: " + this.id +
                "\nNome: " + this.name +
                "\nPreço: " + this.price +
                "\nCategoria: " + this.category.toString(1) +
                "\nAvaliação Geral: " + this.generalRating +
                "\nFoto: " + this.images.get(0);

        return result;
    }

    public void showDetails() {
        String result = "id: " + this.id +
                "\nNome: " + this.name +
                "\nDescrição: " + this.description +
                "\nPreço: " + this.price +
                "\nCategoria: " + this.category.toString(1) +
                "\nUsuario: " + this.user.toString(1) +
                "\nEstado: " + Product.parseState(this.state) +
                "\nLocalização: " + this.location.toString(1) +
                "\nAvaliaçao geral: " + this.generalRating;

        System.out.println(result);

        System.out.println("Meios de Pagamento:");
        Iterator<PaymentMethod> paymentMethodsIterator = this.paymentMethods.iterator();
        while (paymentMethodsIterator.hasNext()) {
            System.out.println(paymentMethodsIterator.next().toString(1));
        }

        System.out.println("\nAvaliações:");
        Iterator<Rating> ratingsIterator = this.ratings.iterator();
        while (ratingsIterator.hasNext()) {
            System.out.println(ratingsIterator.next().toString(1));
        }

    }

    public static String parseState(StateType state) {
        switch (state) {
            case NEW:
                return "Novo";
            case USED:
                return "Usado";
            default:
                return "";
        }
    }
}
