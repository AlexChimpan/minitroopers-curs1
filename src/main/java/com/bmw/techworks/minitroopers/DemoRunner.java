package com.bmw.techworks.minitroopers;

import com.bmw.techworks.minitroopers.basics.*;
import com.bmw.techworks.minitroopers.classdesign.*;
import com.bmw.techworks.minitroopers.oop.*;
import com.bmw.techworks.minitroopers.fp.*;

public class DemoRunner {

    public static void main(String[] args) {
        new HelloJava().printHelloMessage();
        new PrimitivesDemo().demonstratePrimitivesAndCasting();
        new InitOrderDemo().demonstrateInitializationOrder();
        new FunctionalInterfacesDemo().demonstrateCommonFunctionalInterfaces();
        // etc…
    }
}
