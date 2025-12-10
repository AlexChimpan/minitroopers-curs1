package com.bmw.techworks.minitroopers.fp;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesDemo {

    public void demonstrateCommonFunctionalInterfaces() {
        Predicate<String> isLongerThan3 = s -> s.length() > 3;
        Function<String, Integer> toLength = String::length;
        Consumer<String> greeter = name -> System.out.println("Hello " + name);
        Supplier<Double> randomSupplier = Math::random;

        List<String> names = List.of("Ana", "Alex", "Bob");

        System.out.println("Names longer than 3 characters:");
        names.stream()
                .filter(isLongerThan3)
                .forEach(System.out::println);

        System.out.println("\nName lengths:");
        names.stream()
                .map(toLength)
                .forEach(System.out::println);

        System.out.println("\nGreeting each name:");
        names.forEach(greeter);

        System.out.println("\nRandom number from Supplier: " + randomSupplier.get());
    }
}
