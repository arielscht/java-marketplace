package com.marketplace.models;

import com.marketplace.enums.PaymentMethodType;

public class PaymentMethod {
    private PaymentMethodType type;

    public PaymentMethod(PaymentMethodType type){
        this.type = type;
    }

    public PaymentMethodType getType(){
        return type;
    }
}
