
package com.joysistvi.day21.encap;

import java.util.Scanner;

public class Main {

    // Method for accepting non-empty inputs
    public static String getRequiredInput(Scanner scanner, String prompt) {

        String input;

        while (true) {

            System.out.print(prompt);
            input = scanner.nextLine().trim();

            // Check if input is empty
            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("Input cannot be empty. Please try again.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Registration header
        System.out.println("*******************************************");
        System.out.println("*       User Account Registration         *");
        System.out.println("*******************************************");
        System.out.println();

        // Accept personal information
        String firstName = getRequiredInput(scanner, "Enter First Name: ");

        String middleName = getRequiredInput(scanner, "Enter Middle Name: ");

        String lastName = getRequiredInput(scanner, "Enter Last Name: ");

        String address = getRequiredInput(scanner, "Enter Address: ");

        // Email validation loop
        String email;

        while (true) {

            System.out.print("Enter Email: ");
            email = scanner.nextLine().trim();

            // Basic email format validation
            String emailRegex =
                    "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

            if (email.matches(emailRegex)) {

                break;

            } else {

                System.out.println("Invalid email format. Please try again.");
            }
        }

        // Password validation loop
        String password;

        while (true) {

            System.out.print("Enter Password: ");
            password = scanner.nextLine();

            // Check password requirements
            if (password.length() >= 8
                    && password.matches(".*[A-Za-z].*")
                    && password.matches(".*[0-9].*")) {

                break;

            } else {

                System.out.println("Invalid password!");
                System.out.println("Password must contain:");
                System.out.println("- At least 8 characters");
                System.out.println("- At least one letter");
                System.out.println("- At least one number");
                System.out.println("Please try again.");
            }
        }

        // Create UserAccount object using the constructor
        UserAccount user = new UserAccount(
                firstName,
                middleName,
                lastName,
                address,
                email,
                password
        );

        // Display registered account information
        System.out.println();
        System.out.println("--- User Account Created ---");

        // Retrieve information using getter methods
        System.out.println("Full Name: "
                + user.getFirstName() + " "
                + user.getMiddleName() + " "
                + user.getLastName());

        System.out.println("Address: " + user.getAddress());
        System.out.println("Email: " + user.getEmail());

        // Close Scanner
        scanner.close();
    }
}
