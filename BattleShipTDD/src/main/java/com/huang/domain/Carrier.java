package com.huang.domain;

public class Carrier extends Ships {


    public Carrier (String type) {
        this.setType(type);
    }
    public String getType() {
        return this.shipIdentifier;
    }
}
