package org.develhope.java_advanced.oop_concepts.abstact_classes._livecoding;

import java.util.ArrayList;
import java.util.List;


public class PersonRunner {
    public static void main(String[] args) {
        Person man1 = new Man("dawood", 23);
        Person workerMan1 = new WorkerMan("dawood II", 23, "Software Engineer", 40);
        Person workerMan2 = new WorkerMan("Prince", 24, "Doctor", 50);

        Person woman1 = new Woman("melisa", 20);
        Person workerWoman1 = new WorkerWoman("melisa II", 20, "Developer", 42);
        Person workerWoman2 = new WorkerWoman("Hana", 25, "Nurse", 41);

        ArrayList<Person> people = new ArrayList<>(List.of(man1, workerMan1, workerMan2, woman1, workerWoman1, workerWoman2));

        for (Person person : people) {
            person.printNameAndType();
            person.work();


            if( person.getClass().getSimpleName().equals("WorkerMan")) {
                ((WorkerMan)person).getProfile();
            }

        }
    }
}
