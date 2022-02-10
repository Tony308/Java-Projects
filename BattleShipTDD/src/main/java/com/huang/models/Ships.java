package com.huang.models;

public abstract class Ships{

    private int x,y;
    protected int size;

    private int hitPoints;
    private int damagedPoints;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamagedPoints() {
        return damagedPoints;
    }

    public void setDamagedPoints(int damagedPoints) {
        this.damagedPoints = damagedPoints;
    }


}