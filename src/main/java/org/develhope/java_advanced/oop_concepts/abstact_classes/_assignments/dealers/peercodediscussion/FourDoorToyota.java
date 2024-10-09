package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.dealers.peercodediscussion;

public class FourDoorToyota extends FourDoorCar {

    public FourDoorToyota(String model, int year, double mileage, int power) {
        super("Ford", model, year, mileage, power);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota engine started.");
        run();
    }

    @Override
    public void stopEngine() {
        System.out.println("Toyota engine stopped.");
        stop();
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
        System.out.println("Toyota is stopped");
    }

    @Override
    public void repair() {
        System.out.println("Toyota is being repaired");

    }

    @Override
    public String toString() {
        return "FourDoorToyota --> " + super.toString();
    }
}


