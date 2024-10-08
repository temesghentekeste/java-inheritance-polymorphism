package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.vehicle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        interfacesAndAbstractClasses();
        System.out.println();
        System.out.println("Polymorphism: ");
        polymorphismApproach();
    }

    private static void interfacesAndAbstractClasses() {
        // Creating a FourDoorToyota object
        Car camry = new FourDoorToyota("Camry", 2024,  30000, 160);
        System.out.println(camry.getCarInfo());
        camry.run();
        camry.stop();
        camry.repair();
        System.out.println("Selling Price: $" + camry.sell());

        System.out.println();  // Space between examples

        // Creating a FourDoorBMW object
        Car bmwSedan = new FourDoorBMW("Series 5", 2023,  3500, 260);
        System.out.println(bmwSedan.getCarInfo());
        bmwSedan.run();
        bmwSedan.stop();
        bmwSedan.repair();
        System.out.println("Selling Price: $" + bmwSedan.sell());
        System.out.println();  // Space between examples

        // Creating a FourDoorFord object
        Car fordFusion = new FourDoorFord("Fusion", 2022,  40000, 360);
        System.out.println(fordFusion.getCarInfo());
        fordFusion.run();
        fordFusion.stop();
        fordFusion.repair();
        System.out.println("Selling Price: $" + fordFusion.sell());

        System.out.println();  // Space between examples

        // Creating a FourDoorHyundai object
        Car hyundaiSedan = new FourDoorHyundai("Sonata", 2021,  45000, 460);
        System.out.println(hyundaiSedan.getCarInfo());
        hyundaiSedan.run();
        hyundaiSedan.stop();
        hyundaiSedan.repair();
        System.out.println("Selling Price: $" + hyundaiSedan.sell());

        System.out.println();  // Space between examples

        // Creating a TwoDoorToyota object
        Car supra = new TwoDoorToyota("Supra", 2024, 15000, 180);
        System.out.println(supra.getCarInfo());
        supra.run();
        supra.stop();
        supra.repair();
        System.out.println("Selling Price: $" + supra.sell());

        System.out.println();  // Space between examples

        // Creating a TwoDoorBMW object
        Car bmwCoupe = new TwoDoorBMW("M4", 2023, 25000, 280);
        System.out.println(bmwCoupe.getCarInfo());
        bmwCoupe.run();
        bmwCoupe.stop();
        bmwCoupe.repair();
        System.out.println("Selling Price: $" + bmwCoupe.sell());

        System.out.println();  // Space between examples

        // Creating a TwoDoorFord object
        Car fordMustang = new TwoDoorFord("Mustang", 2022, 35000, 380);
        System.out.println(fordMustang.getCarInfo());
        fordMustang.run();
        fordMustang.stop();
        fordMustang.repair();
        System.out.println("Selling Price: $" + fordMustang.sell());

        System.out.println();  // Space between examples

        // Creating a TwoDoorHyundai object
        Car veloster = new TwoDoorHyundai("Veloster", 2023, 45000, 480);
        System.out.println(veloster.getCarInfo());
        veloster.run();
        veloster.stop();
        veloster.repair();
        System.out.println("Selling Price: $" + veloster.sell());


    }

    public static void polymorphismApproach() {
        // Creating an ArrayList of type Car (Polymorphism: storing different car objects)
        ArrayList<Car> cars = new ArrayList<>();

        // Adding different types of cars to the ArrayList
        cars.add(new FourDoorToyota("Camry", 2024,  30000, 160));
        cars.add(new FourDoorBMW("Series 5", 2023,  35000, 260));
        cars.add(new FourDoorFord("Fusion", 2022,  40000, 360));
        cars.add(new FourDoorHyundai("Sonata", 2021,  45000, 460));
        cars.add(new TwoDoorToyota("Supra", 2024, 15000, 180));
        cars.add(new TwoDoorBMW("M4", 2023, 25000, 280));
        cars.add(new TwoDoorFord("Mustang", 2022, 35000, 380));
        cars.add(new TwoDoorHyundai("Veloster", 2023, 45000, 580));

        // Loop through the list and demonstrate polymorphism
        for (Car car : cars) {
            // Polymorphism: Even though the actual object might be FourDoorToyota, etc.,
            // we treat it as a Car and call its methods.
            System.out.println(car.getCarInfo());
            car.run();
            car.stop();
            car.repair();
            System.out.println();  // Space between car outputs
            System.out.println("Selling Price: $" + car.sell());
        }

        System.out.println();
        System.out.println("Demonstrating toString() overriden method: ");
        for (Car car : cars) {
            System.out.println(car);
            System.out.println("Selling Price: $" + car.sell());
        }
    }
}