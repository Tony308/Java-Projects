package com.huang.domain;
public class PatrolBoat extends Ships{

    public PatrolBoat(String type) {
        this.setType(type);
    }

    public String getType() {
        return this.shipIdentifier;
    }
}
