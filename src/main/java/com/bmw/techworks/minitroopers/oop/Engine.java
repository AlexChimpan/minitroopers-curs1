package com.bmw.techworks.minitroopers.oop;

public class Engine {

    private final int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public void start() {
        System.out.println("Engine with " + horsepower + " HP starting...");
    }
}
