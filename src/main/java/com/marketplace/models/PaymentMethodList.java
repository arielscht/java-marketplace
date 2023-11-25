package com.marketplace.models;

import java.util.ArrayList;
import java.util.Iterator;

import javax.json.JsonArray;
import javax.json.JsonObject;

import com.marketplace.enums.PaymentMethodType;

public class PaymentMethodList extends ArrayList<PaymentMethod> {
    public static PaymentMethodList jsonToList(JsonArray jsonArray){
        PaymentMethodList paymentMethods = new PaymentMethodList();

        for (JsonObject jsonPaymentMethod : jsonArray.getValuesAs(JsonObject.class)){
            String type = jsonPaymentMethod.getString("type");
            PaymentMethodType paymentMethodType = PaymentMethodType.valueOf(type);

            PaymentMethod paymentMethod = new PaymentMethod(paymentMethodType);
            paymentMethods.add(paymentMethod);
        }

        return paymentMethods;
    }

    @Override
    public String toString(){
        Iterator<PaymentMethod> iterator = this.iterator();
        ArrayList<String> types = new ArrayList<String>();

        while (iterator.hasNext())
            types.add(iterator.next().getType().getType());

        return String.join(", ", types);
    }
}