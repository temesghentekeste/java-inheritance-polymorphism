package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.dealers;

import java.time.Year;

// Importing abstract class package
public abstract class TwoDoorCar implements Car {
    private String make;
    private String model;
    private int year;
    private int numberOfDoors;
    private double mileage;
    private double power;

    public TwoDoorCar(String make, String model, int year, double mileage, int power) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfDoors = 2;
        this.mileage = mileage;
        this.power = power;
    }

    @Override
    public String getCarInfo() {
        return year + " " + make + " " + model + " - " + numberOfDoors + " Door Car";
    }

    @Override
    public double sell() {
        double basePrice = 20000;
        int currentYear = Year.now().getValue();  // Get the current year dynamically
        int age = currentYear - year;
        double depreciationByYear = age * 1000;
        double depreciationByMileage = mileage * 0.10;
        double powerAdjustment = (power > 150) ? (power - 150) * 100 : 0;

        double finalPrice = basePrice - depreciationByYear - depreciationByMileage + powerAdjustment;
        return Math.max(finalPrice, 0);
    }

    @Override
    public String toString() {
        return "TwoDoorCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", numberOfDoors=" + numberOfDoors +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }

    public abstract void startEngine();

    public abstract void stopEngine();

    public abstract void openDoors();

    // Abstract classes don't implement the Car methods, subclasses will.
}
