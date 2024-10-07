package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.vehicle;

// Importing abstract class package
public abstract class FourDoorCar implements Car {
    private String make;
    private String model;
    private int year;
    private int numberOfDoors;

    public FourDoorCar(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfDoors = 4;
    }

    @Override
    public String getCarInfo() {
        return year + " " + make + " " + model + " - " + numberOfDoors + " Door Car";
    }

    public abstract void startEngine();

    public abstract void stopEngine();

    public abstract void openDoors();

    // Abstract classes don't implement the Car methods, subclasses will.
}
