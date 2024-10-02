package org.develhope.java_advanced.oop_concepts;

public class Main {
    public static void main(String[] args){

//        Animal dog = new Animal("dog");
//        Animal cat = new Animal("cat");
//        Animal lion = new Animal("lion");
//
//        dog.action();
//        cat.action();
//        lion.action();

        Animal lion = new Lion("Simba");
        Animal dog = new Dog("Lucy");
        Animal cat = new Cat("Li");

        lion.action();
        dog.action();
        cat.action();


    }
}

abstract class Animal{
    String name;
    public abstract void makeSound();
    public Animal(String name){
        this.name = name;
    }

    public void action(){
        System.out.println(name+  " which is a " + this.getClass().getSimpleName()+ " is eating");
    }

}

//3- create lion, dog and cat classes from Animal class and
// create an objects from these 3 class then use action function.
class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Lion is making a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Dog is making a sound.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Cat is making a sound.");
    }
}

