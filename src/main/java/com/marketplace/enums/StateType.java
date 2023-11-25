package com.marketplace.enums;

public enum StateType {
    NEW("NOVO"), USED("USADO");

    private final String type;

    private StateType(String type) {
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}