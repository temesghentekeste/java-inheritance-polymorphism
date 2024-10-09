package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.dealers.peercodediscussion;
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

/*
2- implement toString function
on the all classes(not interface and abstract classes)
 */

/*
3- Create Dealer Class

In the dealer store money, Cars and information about dealer.

IT should have show all cars, sell car and add car functions.

To manage everything we need to have a menu
so we need to have dealerMenu() function so that we will just run it and we
will control other functions by scanners.
 */
public interface Car {
    void run();      // Method to start the car
    void stop();     // Method to stop the car
    void repair();   // Method to repair the car
    String getCarInfo();
    double sell();
}