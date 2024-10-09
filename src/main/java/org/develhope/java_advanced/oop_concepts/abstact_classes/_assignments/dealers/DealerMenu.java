package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.dealers;

import java.util.Scanner;

public class DealerMenu {
    static Scanner scanner = new Scanner(System.in);
    private Dealer dealer;

    public DealerMenu(Dealer dealer) {
        this.dealer = dealer;
    }

    // Dealer menu to manage operations
    public void run() {

        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Dealer Menu ---");
            System.out.println("1. Show all cars");
            System.out.println("2. Add a car");
            System.out.println("3. Sell a car");
            System.out.println("4. Show dealer balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    dealer.showAllCars();
                    break;
                case 2:
                    // Example of adding a car manually, in a real system you'd ask the user for input
                    addCarInteractively();  // Call a method to get input for a new car  // Example car
                    break;
                case 3:
                    dealer.showAllCars();
                    if (!dealer.getCars().isEmpty()) {
                        System.out.print("Enter the index of the car to sell: ");
                        int carIndex = scanner.nextInt() - 1;  // Adjusting to 0-based index
                        dealer.sellCar(carIndex);
                    }
                    break;
                case 4:
                    dealer.showBalance();
                    break;
                case 5:
                    System.out.println("Exiting the dealer menu...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Method to interactively add a car based on user input
    private void addCarInteractively() {
        System.out.print("Enter car type (1. FourDoor / 2. TwoDoor): ");
        String carType = scanner.nextLine();
        carType = carType.equals("1") ? "FourDoor" : "TwoDoor";

        System.out.print("Enter car brand (Toyota, BMW, Ford, Hyundai): ");
        String brand = scanner.nextLine();

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter car year: ");
        int year = scanner.nextInt();

        System.out.print("Enter car mileage: ");
        int mileage = scanner.nextInt();

        System.out.print("Enter car power (in horsepower): ");
        int power = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        Car newCar = null;

        // Create the appropriate car object based on the user's input
        switch (carType.toLowerCase()) {
            case "fourdoor":
                newCar = createFourDoorCar(brand, model, year, mileage, power);
                break;
            case "twodoor":
                newCar = createTwoDoorCar(brand, model, year, mileage, power);
                break;
            default:
                System.out.println("Invalid car type entered.");
                return;
        }

        if (newCar != null) {
            dealer.addCar(newCar);
        }
    }

    // Create a FourDoor car based on user input
    private Car createFourDoorCar(String brand, String model, int year, int mileage, int power) {
        switch (brand.toLowerCase()) {
            case "toyota":
                return new FourDoorToyota(model, year, mileage, power);
            case "bmw":
                return new FourDoorBMW(model, year, mileage, power);
            case "ford":
                return new FourDoorFord(model, year, mileage, power);
            case "hyundai":
                return new FourDoorHyundai(model, year, mileage, power);
            default:
                System.out.println("Invalid brand for FourDoor car.");
                return null;
        }
    }

    // Create a TwoDoor car based on user input
    private Car createTwoDoorCar(String brand, String model, int year, int mileage, int power) {
        switch (brand.toLowerCase()) {
            case "toyota":
                return new TwoDoorToyota(model, year, mileage, power);
            case "bmw":
                return new TwoDoorBMW(model, year, mileage, power);
            case "ford":
                return new TwoDoorFord(model, year, mileage, power);
            case "hyundai":
                return new TwoDoorHyundai(model, year, mileage, power);
            default:
                System.out.println("Invalid brand for TwoDoor car.");
                return null;
        }
    }
}
