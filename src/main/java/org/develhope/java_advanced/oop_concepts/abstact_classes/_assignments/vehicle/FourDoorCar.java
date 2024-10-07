package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.vehicle;

// Importing abstract class package
public abstract class FourDoorCar implements Car {
    private String make;
    private String model;
    private int year;

    public FourDoorCar(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String getCarInfo() {
        return year + " " + make + " " + model + " - Four Door Car";
    }

    public abstract void startEngine();

    public abstract void stopEngine();

    public abstract void openDoors();

    // Abstract classes don't implement the Car methods, subclasses will.
}
