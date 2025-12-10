package com.bmw.techworks.minitroopers.basics;

public class OperatorsAndControlFlow {

    public void demonstrateOperatorsAndControlFlow() {
        int a = 5;
        int b = 2;

        int sum = a + b;
        int product = a * b;
        boolean greater = a > b;
        boolean bothPositive = a > 0 && b > 0;

        System.out.println("sum = " + sum);
        System.out.println("product = " + product);
        System.out.println("a > b? " + greater);
        System.out.println("both positive? " + bothPositive);

        if (a % 2 == 0) {
            System.out.println("a is even");
        } else {
            System.out.println("a is odd");
        }

        int day = 2;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            default -> System.out.println("Another day");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("for loop i = " + i);
        }
    }
}
