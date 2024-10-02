package org.develhope.java_advanced.oop_concepts.interfaces;

public interface Animal {
    void eat();
    void drink();
    void sleep();
    void workout();
}

class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }

    @Override
    public void drink() {
        System.out.println("The dog is drinking.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping.");
    }

    @Override
    public void workout() {
        System.out.println("The dog is running around.");
    }
}

class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.workout();
    }
}
