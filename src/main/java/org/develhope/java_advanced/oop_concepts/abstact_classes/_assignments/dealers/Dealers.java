package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.dealers;

import java.util.ArrayList;
import java.util.Scanner;

public class Dealers {
    private ArrayList<Dealer> dealersList;

    public Dealers() {
        this.dealersList = new ArrayList<>();
    }

    // Method to show the main Dealers menu
    public void dealersMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Main Dealers Menu ---");
            System.out.println("1. Show existing dealers");
            System.out.println("2. Create new dealer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    showExistingDealers(scanner);
                    break;
                case 2:
                    createNewDealer(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Method to display existing dealers and navigate to their menu
    private void showExistingDealers(Scanner scanner) {
        if (dealersList.isEmpty()) {
            System.out.println("No dealers available. Please create a new dealer first.");
            return;
        }

        System.out.println("\n--- Existing Dealers ---");
        for (int i = 0; i < dealersList.size(); i++) {
            System.out.println((i + 1) + ". " + dealersList.get(i).getDealerName());
        }

        System.out.print("Enter the index of the dealer to select: ");
        int dealerIndex = scanner.nextInt() - 1;

        if (dealerIndex < 0 || dealerIndex >= dealersList.size()) {
            System.out.println("Invalid dealer selection.");
            return;
        }

        // Run the dealer's menu
        Dealer selectedDealer = dealersList.get(dealerIndex);
        DealerMenu dealerMenu = new DealerMenu(selectedDealer);
        dealerMenu.run();
    }

    // Method to create a new dealer
    private void createNewDealer(Scanner scanner) {
        System.out.print("Enter the name of the new dealer: ");
        String dealerName = scanner.nextLine();

        System.out.print("Enter the starting balance for the new dealer: ");
        double startingBalance = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline character

        Dealer newDealer = new Dealer(dealerName, startingBalance, Initializer.getCars());
        dealersList.add(newDealer);
        System.out.println("Dealer '" + dealerName + "' has been created.");
    }
}
