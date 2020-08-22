package com.huang.domain;

public class Battleship extends Ships {


    public Battleship(String type) {
            this.setType(type);
    }

    public String getType() {
        return this.shipIdentifier;
    }
}
