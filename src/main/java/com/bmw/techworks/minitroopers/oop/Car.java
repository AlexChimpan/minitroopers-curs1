package com.bmw.techworks.minitroopers.oop;

public class Car extends Vehicle {

    private final Engine engine; // composition

    public Car(String name, Engine engine) {
        super(name);
        this.engine = engine;
    }

    @Override
    public void move() {
        engine.start();
        System.out.println(name + " is driving on the road");
    }

    public static Car createSampleCar() {
        Engine engine = new Engine(150);
        return new Car("BMW 1 Series", engine);
    }
}
