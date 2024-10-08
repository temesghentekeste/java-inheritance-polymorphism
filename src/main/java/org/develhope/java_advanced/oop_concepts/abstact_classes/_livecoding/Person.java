package org.develhope.java_advanced.oop_concepts.abstact_classes._livecoding;

public abstract class Person {
      /*
         2- Create inheritance chain.

            Create abstract Person Class and inherit that by Man class then inherit that Man by WorkerMan.
            Inherit Person by Woman then inherit Women by WomanWorker.

            Each class should have function: printNameAndType

            Create main function, in the main function create 6-7-8 people(each of them will be
             type of Man or WorkerMan or Woman or WorkerWoman) (edited)
            [15:36]

            Person <---- Man <----- WorkerMan
            Person <---- Woman <----- WorkerWoman


     */

    public String name;
    public int age;
    abstract void printNameAndType();
    abstract void work();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
