package com.bmw.techworks.minitroopers.oop;

public class Circle extends Shape {

    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor() + " circle with radius " + radius);
    }

    public static Circle createSampleCircle() {
        return new Circle("blue", 2.5);
    }
}
