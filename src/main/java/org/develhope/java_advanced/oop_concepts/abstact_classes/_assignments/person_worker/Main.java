package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.person_worker;

public class Main {
    public static void main(String[] args) {
        // Creating different people (instances of Man, WorkerMan, Woman, WorkerWoman)

        Man man1 = new Man("John", 30);
        WorkerMan workerMan1 = new WorkerMan("Mike", 45, "Software engineer", 40);
        WorkerMan workerMan2 = new WorkerMan("Bob", 28, "Nurse", 30);

        Woman woman1 = new Woman("Alice", 25);
        WorkerWoman workerWoman1 = new WorkerWoman("Eve", 33, "Nurse", 45);
        WorkerWoman workerWoman2 = new WorkerWoman("Sophia", 40, "Web Developer", 37);

        // Storing all persons in an array
        Person[] people = {man1, workerMan1, workerMan2, woman1, workerWoman1, workerWoman2};

        // Looping through the array and calling the work method on each person
        for (Person person : people) {
            System.out.println(person.name + " (" + person.age + " years old)");
            person.work();
            System.out.println();
        }

        woman1.printNameAndType();
        workerWoman2.printNameAndType();
    }
}