package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.dealers.peercodediscussion;

public class FourDoorHyundai extends FourDoorCar {

    public FourDoorHyundai(String model, int year, double mileage, int power) {
        super("Ford", model, year, mileage, power);
    }

    @Override
    public void startEngine() {
        System.out.println("Hyundai engine started.");
        run();
    }

    @Override
    public void stopEngine() {
        System.out.println("Hyundai engine stopped.");
        stop();
    }

    @Override
    public void openDoors() {
        System.out.println("Opening all four Hyundai doors.");
    }

    @Override
    public void run() {
        System.out.println("Hyundai is running.");
    }

    @Override
    public void stop() {
        System.out.println("Hyundai is stopped");
    }

    @Override
    public void repair() {
        System.out.println("Hyundai is being repaired");

    }

    @Override
    public String toString() {
        return "FourDoorHyundai --> " + super.toString();
    }
}


