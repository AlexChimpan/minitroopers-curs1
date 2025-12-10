package com.bmw.techworks.minitroopers.oop;

public class Vehicle {

    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + " is moving");
    }
}
