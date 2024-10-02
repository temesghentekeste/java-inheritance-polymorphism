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


    }
}

abstract class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }

    public void action(){
        System.out.println(name+ " is eating");
    }

}


