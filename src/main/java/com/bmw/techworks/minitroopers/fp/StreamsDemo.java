package com.bmw.techworks.minitroopers.fp;

import java.util.List;

public class StreamsDemo {

    public void demonstrateSimpleStreamPipeline() {
        List<String> names = List.of("Ana", "Alex", "Bob", "Andrei");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
