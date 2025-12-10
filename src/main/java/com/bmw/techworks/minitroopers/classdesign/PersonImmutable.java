package com.bmw.techworks.minitroopers.classdesign;

public final class PersonImmutable {

    private final String name;
    private final int age;

    public PersonImmutable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters only, no setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // used just for printing in demos
    @Override
    public String toString() {
        return "PersonImmutable{name='" + name + "', age=" + age + '}';
    }

    public static PersonImmutable createSamplePerson() {
        return new PersonImmutable("Alex", 25);
    }
}
