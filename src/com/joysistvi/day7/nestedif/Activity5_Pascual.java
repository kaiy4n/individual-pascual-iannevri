package com.joysistvi.day7.nestedif;

import java.util.Scanner;

public class Activity5_Pascual {

    public static void main(String[] args) {

        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Declare variables for the USSD code and menu selections.
        String ussdCodeInput;
        int mainMenuInput, subMenuInput, promoInput;

        // Repeat the process if the user enters an incorrect USSD code.
        do {
            System.out.println("Dial *143# to access Globe Services");
            System.out.print("Enter USSD Code: ");
            ussdCodeInput = scanner.nextLine();
            System.out.println();

            // Check whether the entered USSD code is correct.
            if (ussdCodeInput.equals("*143#")) {

                // Display the available load registration categories.
                System.out.println("\t\t*** Load Registration ***");
                System.out.println("\t[1] Go+");
                System.out.println("\t[2] Go");
                System.out.println("\t[3] GoEXTRA");
                System.out.println("\t[4] UNLI 5G");
                System.out.println("\t[5] ALLNET");
                System.out.print("Enter a choice: ");
                mainMenuInput = scanner.nextInt();
                System.out.println();

                // Determine which promo category the user selected.
                switch (mainMenuInput) {

                    case 1:
                        // Display the available Go+ promos.
                        System.out.println("\t\t*** Go+ Promos ***");
                        System.out.println("\t[1] Go+99");
                        System.out.println("\t[2] Go+129");
                        System.out.println("\t[3] Go+149");
                        System.out.print("Enter a choice: ");
                        subMenuInput = scanner.nextInt();
                        System.out.println();

                        // Identify the selected Go+ promo.
                        switch (subMenuInput) {
                            case 1:
                                System.out.println("\t\t*** Go+99 Promo ***");
                                System.out.println("-> Get 8 GB for all sites + 8 GB");
                                break;
                            case 2:
                                System.out.println("\t\t*** Go+129 Promo ***");
                                System.out.println("-> Get 10 GB for all sites");
                                break;
                            case 3:
                                System.out.println("\t\t*** Go+149 Promo ***");
                                System.out.println("-> Get 12 GB for all sites");
                                break;
                            default:
                                // Handle an invalid Go+ promo selection.
                                System.out.println("Invalid promo choice.");
                                break;
                        }

                        // Proceed to the subscription options only if the promo is valid.
                        if (subMenuInput >= 1 && subMenuInput <= 3) {
                            System.out.println("\t[1] Subscribe");
                            System.out.println("\t[2] Exit");
                            System.out.print("Enter a choice: ");
                            promoInput = scanner.nextInt();
                            System.out.println();

                            // Process the user's subscription decision.
                            if (promoInput == 1) {
                                // Display the name of the selected promo.
                                System.out.println("You are now subscribed to Go+"
                                        + (subMenuInput == 1 ? "99"
                                        : subMenuInput == 2 ? "129" : "149"));
                            } else if (promoInput == 2) {
                                System.out.println("Transaction cancelled.");
                            } else {
                                // Handle an invalid subscription selection.
                                System.out.println("Invalid choice.");
                            }
                        }
                        break;

                    case 2:
                        // Display the available Go promos.
                        System.out.println("\t\t*** Go Promos ***");
                        System.out.println("\t[1] Go50");
                        System.out.println("\t[2] Go90");
                        System.out.println("\t[3] Go120");
                        System.out.print("Enter a choice: ");
                        subMenuInput = scanner.nextInt();
                        System.out.println();

                        // Identify the selected Go promo.
                        switch (subMenuInput) {
                            case 1:
                                System.out.println("\t\t*** Go50 Promo ***");
                                System.out.println("-> Get 5 GB for all sites");
                                break;
                            case 2:
                                System.out.println("\t\t*** Go90 Promo ***");
                                System.out.println("-> Get 8 GB for all sites");
                                break;
                            case 3:
                                System.out.println("\t\t*** Go120 Promo ***");
                                System.out.println("-> Get 10 GB for all sites");
                                break;
                            default:
                                System.out.println("Invalid promo choice.");
                                break;
                        }

                        // Ask the user whether to subscribe to the selected promo.
                        if (subMenuInput >= 1 && subMenuInput <= 3) {
                            System.out.println("\t[1] Subscribe");
                            System.out.println("\t[2] Exit");
                            System.out.print("Enter a choice: ");
                            promoInput = scanner.nextInt();
                            System.out.println();

                            if (promoInput == 1) {
                                // Display the selected Go promo subscription.
                                System.out.println("You are now subscribed to "
                                        + (subMenuInput == 1 ? "Go50"
                                        : subMenuInput == 2 ? "Go90" : "Go120"));
                            } else if (promoInput == 2) {
                                System.out.println("Transaction cancelled.");
                            } else {
                                System.out.println("Invalid choice.");
                            }
                        }
                        break;

                    case 3:
                        // Display the available GoEXTRA promos.
                        System.out.println("\t\t*** GoEXTRA Promos ***");
                        System.out.println("\t[1] GoEXTRA99");
                        System.out.println("\t[2] GoEXTRA129");
                        System.out.println("\t[3] GoEXTRA149");
                        System.out.print("Enter a choice: ");
                        subMenuInput = scanner.nextInt();
                        System.out.println();

                        // Identify the selected GoEXTRA promo.
                        switch (subMenuInput) {
                            case 1:
                                System.out.println("\t\t*** GoEXTRA99 Promo ***");
                                System.out.println("-> Get 8 GB for all sites + 4GB free 5G data");
                                break;
                            case 2:
                                System.out.println("\t\t*** GoEXTRA129 Promo ***");
                                System.out.println("-> Get 10 GB for all sites + 6GB free 5G data");

                                break;
                            case 3:
                                System.out.println("\t\t*** GoEXTRA149 Promo ***");
                                System.out.println("-> Get 13 GB for all sites + 8GB free 5G data");
                                break;
                            default:
                                System.out.println("Invalid promo choice.");
                                break;
                        }

                        // Continue only if the selected promo is valid.
                        if (subMenuInput >= 1 && subMenuInput <= 3) {
                            System.out.println("\t[1] Subscribe");
                            System.out.println("\t[2] Exit");
                            System.out.print("Enter a choice: ");
                            promoInput = scanner.nextInt();
                            System.out.println();

                            if (promoInput == 1) {
                                // Display the selected GoEXTRA subscription.
                                System.out.println("You are now subscribed to "
                                        + (subMenuInput == 1 ? "GoEXTRA99"
                                        : subMenuInput == 2 ? "GoEXTRA129"
                                        : "GoEXTRA149"));
                            } else if (promoInput == 2) {
                                System.out.println("Transaction cancelled.");
                            } else {
                                System.out.println("Invalid choice.");
                            }
                        }
                        break;

                    case 4:
                        // Display the available UNLI 5G promos.
                        System.out.println("\t\t*** UNLI 5G Promos ***");
                        System.out.println("\t[1] UNLI 5G 99");
                        System.out.println("\t[2] UNLI 5G 149");
                        System.out.println("\t[3] UNLI 5G 199");
                        System.out.print("Enter a choice: ");
                        subMenuInput = scanner.nextInt();
                        System.out.println();

                        // Identify the selected UNLI 5G promo.
                        switch (subMenuInput) {
                            case 1:
                                System.out.println("\t\t*** UNLI 5G 99 Promo ***");
                                break;
                            case 2:
                                System.out.println("\t\t*** UNLI 5G 149 Promo ***");
                                break;
                            case 3:
                                System.out.println("\t\t*** UNLI 5G 199 Promo ***");
                                break;
                            default:
                                System.out.println("Invalid promo choice.");
                                break;
                        }

                        // Ask for confirmation before subscribing.
                        if (subMenuInput >= 1 && subMenuInput <= 3) {
                            System.out.println("\t[1] Subscribe");
                            System.out.println("\t[2] Exit");
                            System.out.print("Enter a choice: ");
                            promoInput = scanner.nextInt();
                            System.out.println();

                            if (promoInput == 1) {
                                // Display the selected UNLI 5G subscription.
                                System.out.println("You are now subscribed to "
                                        + (subMenuInput == 1 ? "UNLI 5G 99"
                                        : subMenuInput == 2 ? "UNLI 5G 149"
                                        : "UNLI 5G 199"));
                            } else if (promoInput == 2) {
                                System.out.println("Transaction cancelled.");
                            } else {
                                System.out.println("Invalid choice.");
                            }
                        }
                        break;

                    case 5:
                        // Display the available ALLNET promos.
                        System.out.println("\t\t*** ALLNET Promos ***");
                        System.out.println("\t[1] ALLNET99");
                        System.out.println("\t[2] ALLNET149");
                        System.out.println("\t[3] ALLNET199");
                        System.out.print("Enter a choice: ");
                        subMenuInput = scanner.nextInt();
                        System.out.println();

                        // Identify the selected ALLNET promo.
                        switch (subMenuInput) {
                            case 1:
                                System.out.println("\t\t*** ALLNET99 Promo ***");
                                break;
                            case 2:
                                System.out.println("\t\t*** ALLNET149 Promo ***");
                                break;
                            case 3:
                                System.out.println("\t\t*** ALLNET199 Promo ***");
                                break;
                            default:
                                System.out.println("Invalid promo choice.");
                                break;
                        }

                        // Ask for confirmation before subscribing.
                        if (subMenuInput >= 1 && subMenuInput <= 3) {
                            System.out.println("[1] Subscribe");
                            System.out.println("[2] Exit");
                            System.out.print("Enter a choice: ");
                            promoInput = scanner.nextInt();
                            System.out.println();

                            if (promoInput == 1) {
                                // Display the selected ALLNET subscription.
                                System.out.println("You are now subscribed to "
                                        + (subMenuInput == 1 ? "ALLNET99"
                                        : subMenuInput == 2 ? "ALLNET149"
                                        : "ALLNET199"));
                            } else if (promoInput == 2) {
                                System.out.println("Transaction cancelled.");
                            } else {
                                System.out.println("Invalid choice.");
                            }
                        }
                        break;

                    default:
                        // Handle an invalid main menu selection.
                        System.out.println("Invalid menu choice.");
                        break;
                }

                // Stop the loop after processing a valid USSD code.
                break;

            } else {
                // Display an error and repeat if the USSD code is incorrect.
                System.out.println("Invalid USSD code. Please try again.");
                System.out.println();
            }

        } while (true);

        // Close the Scanner after all input operations are complete.
        scanner.close();
    }
}
