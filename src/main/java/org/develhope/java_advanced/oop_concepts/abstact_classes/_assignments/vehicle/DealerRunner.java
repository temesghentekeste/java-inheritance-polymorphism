package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.vehicle;

import java.util.ArrayList;
import java.util.List;

public class DealerRunner {
    public static void main(String[] args) {
        // Create a dealer
        Dealer dealer = new Dealer("Temesghen's Car Dealership", 50000);  // Dealer with $50,000 starting balance
        dealer.intialize(getCars());
        // Create the dealer menu
        DealerMenu menu = new DealerMenu(dealer);

        // Run the menu
        menu.run();
    }

    private static List<Car> getCars() {
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

        return cars;
    }
}
