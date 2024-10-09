package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.dealers;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private String dealerName;
    private double money;
    private List<Car> cars;

    public Dealer(String dealerName, double money) {
        this.dealerName = dealerName;
        this.money = money;
        this.cars = new ArrayList<>();
    }

    // Show all cars available in the inventory
    public void showAllCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars available in the inventory.");
        } else {
            System.out.println("Cars available in the dealer's inventory:");
            for (int i = 0; i < cars.size(); i++) {
                System.out.println((i + 1) + ". " + cars.get(i).getCarInfo() + " - Selling Price: $" + cars.get(i).sell());
            }
        }
    }

    // Add a car to the inventory
    public void addCar(Car car) {
        cars.add(car);
        System.out.println(car.getCarInfo() + " has been added to the inventory.");
    }

    // Sell a car from the inventory
    public void sellCar(int carIndex) {
        if (carIndex < 0 || carIndex >= cars.size()) {
            System.out.println("Invalid car index. Please try again.");
            return;
        }
        Car car = cars.get(carIndex);
        double price = car.sell();
        money += price;
        cars.remove(carIndex);
        System.out.println("Car sold: " + car.getCarInfo() + " for $" + price);
        System.out.println("Dealer's new balance: $" + money);
    }

    // Show the current balance of the dealer
    public void showBalance() {
        System.out.println("Dealer's current balance: $" + money);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void intialize(List<Car> cars) {
        setCars(cars);
    }
}
