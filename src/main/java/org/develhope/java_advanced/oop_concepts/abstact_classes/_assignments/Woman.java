package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments;

class Woman extends Person {

    public Woman(String name, int age) {
        super(name, age);
    }

    // Implement abstract method
    @Override
    public void work() {
        System.out.println(name + " is a woman and might not have a specific job.");
    }
}