package com.bmw.techworks.minitroopers.oop;

public abstract class Shape implements Drawable {

    private final String color;

    protected Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
