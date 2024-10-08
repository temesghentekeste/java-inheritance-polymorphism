package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.vehicle;
/*
Today's Goal:

Car <Interface>
-> FourDoorCar <Abstract Class>
->->FourDoorToyota <Class>
->->FourDoorBMW <Class>
->->FourDoorFord<Class>
->->FourDoorHyundai <Class>
-> TwoDoorCar <Abstract Class>
->->TwoDoorToyota <Class>
->->TwoDoorBMW <Class>
->->TwoDoorFord <Class>
->->TwoDoorHyundai <Class>
 */

/*
1- Add Sell Function that returns double into Car interface and implement it
from the inner classes(calculate price by year mileage and power)
 */
public interface Car {
    void run();      // Method to start the car
    void stop();     // Method to stop the car
    void repair();   // Method to repair the car
    String getCarInfo();
    double sell();
}