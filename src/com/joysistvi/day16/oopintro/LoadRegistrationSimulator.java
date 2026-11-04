
package com.joysistvi.day16.oopintro;

import java.util.Scanner;

public class LoadRegistrationSimulator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        dialUssdCode();
    }

    public static void dialUssdCode() {

        while (true) {
            System.out.println("Dial *143# to access Globe Services");
            System.out.print("Enter USSD Code: ");
            String ussdCode = scanner.nextLine();

            if (!ussdCode.equals("*143#")) {
                System.out.println("Invalid USSD Code! Please try again.\n");
                continue;
            }

            promptMainMenu();
            return;
        }
    }

    public static void promptMainMenu() {

        while (true) {
            System.out.println();
            System.out.println("        * Load Registration *");
            System.out.println("    [1] Go+");
            System.out.println("    [2] Go");
            System.out.println("    [3] GoEXTRA");
            System.out.println("    [4] UNLI 5G");
            System.out.println("    [5] ALLNET");
            System.out.println("    [0] Exit");

            int mainChoice = getInput("Enter a choice: ");

            switch (mainChoice) {
                case 1 -> goPlusPromo();
                case 2 -> goPromo();
                case 3 -> goExtraPromo();
                case 4 -> unli5GPromo();
                case 5 -> allNetPromo();
                case 0 -> {
                    if (exitMethod()) {
                        return;
                    }
                }
                default -> System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void goPlusPromo() {

        while (true) {
            System.out.println("\n\n\n       *** Go+ Promos ***");
            System.out.println("    [1] Go+99");
            System.out.println("    [2] Go+129");
            System.out.println("    [3] Go+149");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int goPlusChoice = getInput("Enter a choice: ");

            switch (goPlusChoice) {
                case 1 -> {
                    if (promoDetailsMenu("Go+99", 8, 8)) return;
                }
                case 2 -> {
                    if (promoDetailsMenu("Go+129", 16, 16)) return;
                }
                case 3 -> {
                    if (promoDetailsMenu("Go+149", 32, 32)) return;
                }
                case 4 -> {
                    return;
                }
                case 0 -> {
                    if (exitMethod()) {
                        System.exit(0);
                    }
                }
                default -> System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void goPromo() {

        while (true) {
            System.out.println("\n        *** Go Promos ***");
            System.out.println("    [1] Go50");
            System.out.println("    [2] Go90");
            System.out.println("    [3] Go120");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int goChoice = getInput("Enter a choice: ");

            switch (goChoice) {
                case 1 -> {
                    if (promoDetailsMenu("Go50", 5, 3)) return;
                }
                case 2 -> {
                    if (promoDetailsMenu("Go90", 8, 5)) return;
                }
                case 3 -> {
                    if (promoDetailsMenu("Go120", 12, 8)) return;
                }
                case 4 -> {
                    return;
                }
                case 0 -> {
                    if (exitMethod()) {
                        System.exit(0);
                    }
                }
                default -> System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void goExtraPromo() {

        while (true) {
            System.out.println("\n        *** GoEXTRA Promos ***");
            System.out.println("    [1] GoEXTRA99");
            System.out.println("    [2] GoEXTRA129");
            System.out.println("    [3] GoEXTRA149");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int goExtraChoice = getInput("Enter a choice: ");

            switch (goExtraChoice) {
                case 1 -> {
                    if (promoDetailsMenu("GoEXTRA99", "Sample GoEXTRA package details")) return;
                }
                case 2 -> {
                    if (promoDetailsMenu("GoEXTRA129", "Sample GoEXTRA package details")) return;
                }
                case 3 -> {
                    if (promoDetailsMenu("GoEXTRA149", "Sample GoEXTRA package details")) return;
                }
                case 4 -> {
                    return;
                }
                case 0 -> {
                    if (exitMethod()) {
                        System.exit(0);
                    }
                }
                default -> System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void unli5GPromo() {

        while (true) {
            System.out.println("\n        *** UNLI 5G Promos ***");
            System.out.println("    [1] UNLI 5G 1 Day");
            System.out.println("    [2] UNLI 5G 7 Days");
            System.out.println("    [3] UNLI 5G 30 Days");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int unliChoice = getInput("Enter a choice: ");

            switch (unliChoice) {
                case 1 -> {
                    if (promoDetailsMenu("UNLI 5G 1 Day", "Unlimited 5G access for 1 day")) return;
                }
                case 2 -> {
                    if (promoDetailsMenu("UNLI 5G 7 Days", "Unlimited 5G access for 7 days")) return;
                }
                case 3 -> {
                    if (promoDetailsMenu("UNLI 5G 30 Days", "Unlimited 5G access for 30 days")) return;
                }
                case 4 -> {
                    return;
                }
                case 0 -> {
                    if (exitMethod()) {
                        System.exit(0);
                    }
                }
                default -> System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void allNetPromo() {

        while (true) {
            System.out.println("\n        *** ALLNET Promos ***");
            System.out.println("    [1] ALLNET 99");
            System.out.println("    [2] ALLNET 149");
            System.out.println("    [3] ALLNET 199");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int allNetChoice = getInput("Enter a choice: ");

            switch (allNetChoice) {
                case 1 -> {
                    if (promoDetailsMenu("ALLNET 99", "Sample ALLNET package details")) return;
                }
                case 2 -> {
                    if (promoDetailsMenu("ALLNET 149", "Sample ALLNET package details")) return;
                }
                case 3 -> {
                    if (promoDetailsMenu("ALLNET 199", "Sample ALLNET package details")) return;
                }
                case 4 -> {
                    return;
                }
                case 0 -> {
                    if (exitMethod()) {
                        System.exit(0);
                    }
                }
                default -> System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static boolean promoDetailsMenu(String promoName, int gb, int freeGB) {

        while (true) {
            System.out.println();
            System.out.println("        *** " + promoName + " Promo ***");
            System.out.println("-> Get " + gb + " GB for all sites + " + freeGB + " GB.");
            System.out.println("    [1] Subscribe");
            System.out.println("    [2] Back");
            System.out.println("    [0] Exit");

            int actionChoice = getInput("Enter a choice: ");

            switch (actionChoice) {
                case 1 -> {
                    System.out.println("\nSuccessfully subscribed to " + promoName + "!");
                    System.out.println("Thank you for using Globe Services!");
                    return true;
                }
                case 2 -> {
                    return false;
                }
                case 0 -> {
                    if (exitMethod()) {
                        System.exit(0);
                    }
                }
                default -> System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static boolean promoDetailsMenu(String promoName, String description) {

        while (true) {
            System.out.println();
            System.out.println("        *** " + promoName + " Promo ***");
            System.out.println("-> " + description);
            System.out.println("    [1] Subscribe");
            System.out.println("    [2] Back");
            System.out.println("    [0] Exit");

            int actionChoice = getInput("Enter a choice: ");

            switch (actionChoice) {
                case 1 -> {
                    System.out.println("\nSuccessfully subscribed to " + promoName + "!");
                    System.out.println("Thank you for using Globe Services!");
                    return true;
                }
                case 2 -> {
                    return false;
                }
                case 0 -> {
                    if (exitMethod()) {
                        System.exit(0);
                    }
                }
                default -> System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static boolean exitMethod() {

        while (true) {
            System.out.println("\nAre you sure that you want to exit the program?");
            System.out.println("[Y] Yes - Exit Program");
            System.out.println("[N] No - Return to Main Menu");

            System.out.print("\nEnter your choice: ");
            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Exiting...");
                return true;
            } else if (choice.equalsIgnoreCase("N")) {
                System.out.println("Returning Back to Main Menu");
                return false;
            } else {
                System.out.println("Invalid Input. Please enter Y or N.");
            }
        }
    }

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
}

