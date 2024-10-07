package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.vehicle;

public class FourDoorHyundai extends FourDoorCar {

    public FourDoorHyundai(String model, int year) {
        super("Hyundai", model, year);
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
}


