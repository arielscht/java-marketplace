package com.marketplace.enums;

public enum PaymentMethodType {
    CASH("Dinheiro"), CREDIT_CARD("Cartão de Crédito"), DEBIT_CARD("Cartão de Débito"), PIX("Pix");

    private final String type;

    private PaymentMethodType(String type) {
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}