package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments;

abstract class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to be implemented by subclasses
    public abstract void work();
}