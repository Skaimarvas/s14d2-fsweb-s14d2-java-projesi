package com.workintech.composition;

public class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    public void create(){
        System.out.println("Wall's direction to " + getDirection());
    }
}
