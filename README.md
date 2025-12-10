# Java MiniTroopers – Training Examples

This repository contains example Java classes used during the MiniTroopers Java Fundamentals training.  
Each folder maps directly to a topic covered in the presentation, and each class contains small, focused
methods that demonstrate one concept at a time.

## Project Structure

```
src/
  main/
    java/
      com/bmw/techworks/minitroopers/
        basics/
          HelloJava.java
          StaticTypingDemo.java
          PrimitivesDemo.java
          OperatorsAndControlFlow.java
        classdesign/
          PersonImmutable.java
          InitOrderDemo.java
        oop/
          Vehicle.java
          Engine.java
          Car.java
          Drawable.java
          Shape.java
          Circle.java
        fp/
          FunctionalInterfacesDemo.java
          LambdasDemo.java
          StreamsDemo.java
  DemoRunner.java
```

## How to Use

Call any demo method from DemoRunner or unit tests:

```java
new PrimitivesDemo().demonstratePrimitivesAndCasting();
new FunctionalInterfacesDemo().demonstrateCommonFunctionalInterfaces();
```

## Topics Covered

### Basics
- Static typing
- Primitives & casting
- Operators & control flow
- Switch expressions

### Class Design
- Immutability (`PersonImmutable`)
- Initialization order (`InitOrderDemo`)

### OOP
- Inheritance vs composition
- Interfaces & abstract classes

### Functional Programming
- Lambdas
- Common functional interfaces
- Stream pipelines

## Exercises

### Basics
- Create methods demonstrating primitives
- Write a switch expression using Strings

### Class Design
- Make a mutable class immutable

### OOP
- Add `Rectangle` extending `Shape`

### Functional Programming
- Create a Predicate checking even numbers

## Requirements
- Java 21+
- Any IDE

## License
Internal educational use only.
