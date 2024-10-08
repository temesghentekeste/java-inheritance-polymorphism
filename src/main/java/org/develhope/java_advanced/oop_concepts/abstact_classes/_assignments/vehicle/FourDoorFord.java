package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.vehicle;

public class FourDoorFord extends FourDoorCar {

    public FourDoorFord(String model, int year, double mileage, int power) {
        super("Ford", model, year, mileage, power);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford engine started.");
        run();
    }

    @Override
    public void stopEngine() {
        System.out.println("Ford engine stopped.");
        stop();
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
        System.out.println("Ford is stopped");
    }

    @Override
    public void repair() {
        System.out.println("Ford is being repaired");

    }


}


