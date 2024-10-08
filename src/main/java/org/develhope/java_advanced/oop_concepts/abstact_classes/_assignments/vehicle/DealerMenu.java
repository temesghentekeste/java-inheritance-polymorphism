package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.vehicle;

import java.util.Scanner;

public class DealerMenu {
    private Dealer dealer;

    public DealerMenu(Dealer dealer) {
        this.dealer = dealer;
    }

    // Dealer menu to manage operations
    public void run() {
        Scanner scanner = new Scanner(System.in);
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
                    dealer.addCar(new FourDoorToyota("Camry", 2020, 30000, 160));  // Example car
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
}
