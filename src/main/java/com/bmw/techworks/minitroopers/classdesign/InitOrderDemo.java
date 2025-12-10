package com.bmw.techworks.minitroopers.classdesign;

public class InitOrderDemo {

    // 1. static fields
    static int staticValue = initStatic();

    // 2. static block
    static {
        System.out.println("Static block");
    }

    // 3. instance fields
    int instanceValue = initInstance();

    // 4. instance initializer block
    {
        System.out.println("Instance initializer block");
    }

    // 5. constructor
    public InitOrderDemo() {
        System.out.println("Constructor");
    }

    private static int initStatic() {
        System.out.println("Static field initialization");
        return 1;
    }

    private int initInstance() {
        System.out.println("Instance field initialization");
        return 2;
    }

    public void demonstrateInitializationOrder() {
        System.out.println("Instance method called on InitOrderDemo");
    }
}
