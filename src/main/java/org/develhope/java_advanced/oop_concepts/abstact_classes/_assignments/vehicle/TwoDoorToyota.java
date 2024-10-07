package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.vehicle;

public class TwoDoorToyota extends TwoDoorCar {

    public TwoDoorToyota(String model, int year) {
        super("Toyota", model, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Toyota engine stopped.");
    }

    @Override
    public void openDoors() {
        System.out.println("Opening all four Toyota doors.");
    }

    @Override
    public void run() {
        System.out.println("Toyota is running.");
    }

    @Override
    public void stop() {
        System.out.println("Toyota is stopping");
    }

    @Override
    public void repair() {
        System.out.println("Toyota is being repaired");

    }
}


