package com.huang.domain;

public class Destroyer extends Ships {
    public Destroyer(String type) {
        this.setType(type);
    }
    public String getType() {
        return this.shipIdentifier;
    }

}
