package com.joysistvi.day18.exception;

import java.util.Scanner;

public class LoadRegistrationSimulator {

    static Scanner scanner = new Scanner(System.in);

    static int balance = 500;

    public static void main(String[] args) {
        dialUssdCode();
        promptMainMenu();
    }


    // Keeps asking until the user enters *143#
    public static void dialUssdCode() {
        clearScreen();
        System.out.println("Dial *143# to access Globe Services");

        while (true) {
            System.out.print("Enter USSD Code: ");
            String ussdCode = scanner.nextLine().trim();

            if (ussdCode.equals("*143#")) {
                return;
            }

            System.out.println("Invalid USSD Code. Please try again.");
        }
    }


    public static void promptMainMenu() {
        while (true) {
            clearScreen();
            System.out.println("        * Load Registration *");
            System.out.println("    [1] Go+");
            System.out.println("    [2] Go");
            System.out.println("    [3] GoEXTRA");
            System.out.println("    [4] UNLI 5G");
            System.out.println("    [5] ALLNET");
            System.out.println("    [6] Check Balance");
            System.out.println("    [7] Borrow Load");
            System.out.println("    [0] Exit");

            int mainChoice = getInput("Enter a choice: ", 0, 7);

            switch (mainChoice) {
                case 1 -> goPlusPromo();
                case 2 -> goPromo();
                case 3 -> goExtraPromo();
                case 4 -> unli5GPromo();
                case 5 -> allNetPromo();
                case 6 -> checkBalance();
                case 7 -> borrowLoad();
                case 0 -> exitMethod();
            }
        }
    }

    public static void checkBalance() {
        clearScreen();
        System.out.println("--------------------------------");
        System.out.println("Your current balance is: P" + balance);
        System.out.println("--------------------------------");
        pressEnterToContinue();
    }

    public static void borrowLoad() {
        clearScreen();
        System.out.println("*** Borrow Load ***");
        System.out.println("   [1] Borrow P10");
        System.out.println("   [2] Back to Main Menu");

        int choice = getInput("Enter a choice: ", 1, 2);

        if (choice == 1) {
            balance += 10;
            System.out.println("\nSuccessfully borrowed P10! Your new balance is: P" + balance);
            pressEnterToContinue();
        }
    }

    // For every promo list below:
    //   - choosing a promo goes straight to subscriptionConfirmation(promoName, price, gb, freeGB)
    //   - Back [4] returns to the main menu
    public static void goPlusPromo() {
        while (true) {
            clearScreen();
            System.out.println("        *** Go+ Promos ***");
            System.out.println("    [1] Go+99");
            System.out.println("    [2] Go+129");
            System.out.println("    [3] Go+149");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int choice = getInput("Enter a choice: ", 0, 4);

            switch (choice) {
                case 1 -> subscriptionConfirmation("Go+99", 99, 8, 8);
                case 2 -> subscriptionConfirmation("Go+129", 129, 16, 16);
                case 3 -> subscriptionConfirmation("Go+149", 149, 32, 32);
                case 4 -> { return; }
                case 0 -> exitMethod();
            }
        }
    }

    public static void goPromo() {
        while (true) {
            clearScreen();
            System.out.println("        *** Go Promos ***");
            System.out.println("    [1] Go50");
            System.out.println("    [2] Go90");
            System.out.println("    [3] Go120");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int choice = getInput("Enter a choice: ", 0, 4);

            switch (choice) {
                case 1 -> subscriptionConfirmation("Go50", 50, 5, 3);
                case 2 -> subscriptionConfirmation("Go90", 90, 8, 5);
                case 3 -> subscriptionConfirmation("Go120", 120, 12, 8);
                case 4 -> { return; }
                case 0 -> exitMethod();
            }
        }
    }


    public static void goExtraPromo() {
        while (true) {
            clearScreen();
            System.out.println("        *** GoEXTRA Promos ***");
            System.out.println("    [1] GoEXTRA99");
            System.out.println("    [2] GoEXTRA129");
            System.out.println("    [3] GoEXTRA149");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int choice = getInput("Enter a choice: ", 0, 4);

            switch (choice) {
                case 1 -> subscriptionConfirmation("GoEXTRA99", 99, 8, 8);
                case 2 -> subscriptionConfirmation("GoEXTRA129", 129, 16, 16);
                case 3 -> subscriptionConfirmation("GoEXTRA149", 149, 32, 32);
                case 4 -> { return; }
                case 0 -> exitMethod();
            }
        }
    }


    public static void unli5GPromo() {
        while (true) {
            clearScreen();
            System.out.println("        *** UNLI 5G Promos ***");
            System.out.println("    [1] UNLI 5G 99");
            System.out.println("    [2] UNLI 5G 149");
            System.out.println("    [3] UNLI 5G 199");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int choice = getInput("Enter a choice: ", 0, 4);

            switch (choice) {
                case 1 -> subscriptionConfirmation("UNLI 5G 99", 99, 8, 8);
                case 2 -> subscriptionConfirmation("UNLI 5G 149", 149, 16, 16);
                case 3 -> subscriptionConfirmation("UNLI 5G 199", 199, 32, 32);
                case 4 -> { return; }
                case 0 -> exitMethod();
            }
        }
    }


    public static void allNetPromo() {
        while (true) {
            clearScreen();
            System.out.println("        *** ALLNET Promos ***");
            System.out.println("    [1] ALLNET99");
            System.out.println("    [2] ALLNET149");
            System.out.println("    [3] ALLNET199");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int choice = getInput("Enter a choice: ", 0, 4);

            switch (choice) {
                case 1 -> subscriptionConfirmation("ALLNET99", 99, 8, 8);
                case 2 -> subscriptionConfirmation("ALLNET149", 149, 16, 16);
                case 3 -> subscriptionConfirmation("ALLNET199", 199, 32, 32);
                case 4 -> { return; }
                case 0 -> exitMethod();
            }
        }
    }

    // Shows the promo details and asks the user to confirm.
    // Back just returns to the promo list.
    public static void subscriptionConfirmation(String promoName, int price, int gb, int freeGB) {
        clearScreen();
        System.out.println("        *** " + promoName + " Promo ***");
        System.out.println("-> Get " + gb + " GB for all sites + " + freeGB + " GB.");
        System.out.println("-> Confirm registration for " + promoName + " for P" + price + "?");
        System.out.println("   [1] Yes, Subscribe");
        System.out.println("   [2] Back");

        int subChoice = getInput("Enter a choice: ", 1, 2);

        if (subChoice == 1) {
            if (balance < price) {
                System.out.println("\n[Transaction Error] Insufficient balance! Please load or borrow load first.");
                pressEnterToContinue();
            } else {
                balance -= price;
                System.out.println("\nSUCCESS: You are now successfully subscribed to " + promoName + "!");
                System.out.println("Remaining Balance: P" + balance);
                System.exit(0);
            }

        }
    }

    // Shows the promo details and asks the user to confirm.
    // Choosing [2] Back skips the if block, so the method ends and Java  automatically returns to the caller (the promo list's switch).
    // The promo list is inside a while loop, so it displays its menu again.

    // The only place where the program really ends (when the user answers Y)
    public static void exitMethod() {
        clearScreen();
        System.out.println("Are you sure that you want to exit the program?");
        System.out.println("    [Y] Yes - Exit Program");
        System.out.println("    [N] No - Go Back");

        while (true) {
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
                System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
            } else if (choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("no")) {
                return;
            }

            System.out.println("Invalid Input. Please enter Y or N.");
        }
    }

    // Clears the terminal using ANSI escape codes
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println();
    }

    // Pauses so the user can read a message before the screen is cleared
    public static void pressEnterToContinue() {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }

    // Keeps asking until the user enters a valid integer
    public static int getInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a number.");
            }
        }
    }

    // Keeps asking until the user enters an integer from min to max
    public static int getInput(String prompt, int min, int max) {
        while (true) {
            int number = getInput(prompt);

            if (number >= min && number <= max) {
                return number;
            }

            System.out.println("Invalid Input. Please enter a number from " + min + " to " + max + ".");
        }
    }
}