package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.dealers.peercodediscussion;

public class FourDoorBMW extends FourDoorCar {


    public FourDoorBMW(String model, int year, double mileage, int power) {
        super("Ford", model, year, mileage, power);
    }

    @Override
    public void startEngine() {
        System.out.println("BMW engine started.");
        run();
    }

    @Override
    public void stopEngine() {
        System.out.println("BMW engine stopped.");
        stop();
    }

    @Override
    public void openDoors() {
        System.out.println("Opening all four BMW doors.");
    }

    @Override
    public void run() {
        System.out.println("BMW is running.");
    }

    @Override
    public void stop() {
        System.out.println("BMW is stopped");
    }

    @Override
    public void repair() {
        System.out.println("BMW is being repaired");

    }

    @Override
    public String toString() {
        return "FourDoorBMW --> " + super.toString();
    }
}


