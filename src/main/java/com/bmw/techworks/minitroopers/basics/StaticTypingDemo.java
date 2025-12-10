package com.bmw.techworks.minitroopers.basics;

public class StaticTypingDemo {

    public void showStaticTypingExample() {
        int number = 42;
        // number = "hello"; // does not compile – type safety

        String text = "42";
        int parsed = Integer.parseInt(text);

        System.out.println("number = " + number);
        System.out.println("parsed = " + parsed);
    }
}
