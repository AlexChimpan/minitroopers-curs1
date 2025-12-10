package com.bmw.techworks.minitroopers.fp;

public class LambdasDemo {

    @FunctionalInterface
    interface IntOperation {
        int apply(int x, int y);
    }

    public void showLambdaOperations() {
        IntOperation add = (x, y) -> x + y;
        IntOperation multiply = (x, y) -> x * y;

        System.out.println("3 + 4 = " + add.apply(3, 4));
        System.out.println("3 * 4 = " + multiply.apply(3, 4));
    }
}
