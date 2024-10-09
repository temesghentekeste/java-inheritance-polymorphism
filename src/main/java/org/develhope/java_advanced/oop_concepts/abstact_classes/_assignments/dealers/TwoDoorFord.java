package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.dealers;

public class TwoDoorFord extends TwoDoorCar {

    public TwoDoorFord(String model, int year, double mileage, int power) {
        super("Ford", model, year, mileage, power);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Ford engine stopped.");
    }

    @Override
    public void openDoors() {
        System.out.println("Opening all four Ford doors.");
    }

    @Override
    public void run() {
        System.out.println("Ford is running.");
    }

    @Override
    public void stop() {
        System.out.println("Ford is stopping");
    }

    @Override
    public void repair() {
        System.out.println("Ford is being repaired");

    }

    @Override
    public String toString() {
        return "TwoDoorFord --> " + super.toString();
    }
}


