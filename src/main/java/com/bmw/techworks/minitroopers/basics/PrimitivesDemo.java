package com.bmw.techworks.minitroopers.basics;

public class PrimitivesDemo {

    public void demonstratePrimitivesAndCasting() {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;

        float f = 3.14f;
        double d = 3.1415926535;

        char c = 'A';
        boolean flag = true;

        double fromInt = i;          // widening
        int fromDouble = (int) d;    // narrowing

        Integer boxed = i;           // autoboxing
        int unboxed = boxed;         // unboxing

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);
        System.out.println("widening int -> double: " + fromInt);
        System.out.println("narrowing double -> int: " + fromDouble);
        System.out.println("boxed Integer: " + boxed + ", unboxed: " + unboxed);
    }
}
