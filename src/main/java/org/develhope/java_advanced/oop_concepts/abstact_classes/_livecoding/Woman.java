package org.develhope.java_advanced.oop_concepts.abstact_classes._livecoding;

public class Woman extends  Person{

    public Woman(String name, int age) {
        super(name, age);
    }

    @Override
    void printNameAndType() {
        System.out.println(name + " is " + this.getClass().getSimpleName());
    }

    @Override
    void work() {
        System.out.println(name + " is Woman and can have a work or not" );
    }
}
