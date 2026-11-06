package com.joysistvi.day20.encapsulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display registration header
        System.out.println("*******************************************");
        System.out.println("*       User Account Registration         *");
        System.out.println("*******************************************");
        System.out.println();

        // Accept user information
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Create UserAccount object using the entered information
        try {

            UserAccount user = new UserAccount(
                    firstName,
                    middleName,
                    lastName,
                    address,
                    email,
                    password
            );

            // Display successful registration message
            System.out.println();
            System.out.println("--- User Account Created ---");

            // Retrieve information using getter methods
            System.out.println("Full Name: "
                    + user.getFirstName() + " "
                    + user.getMiddleName() + " "
                    + user.getLastName());

            System.out.println("Address: " + user.getAddress());
            System.out.println("Email: " + user.getEmail());

        } catch (IllegalArgumentException e) {

            // Display validation error if email or password is invalid
            System.out.println();
            System.out.println("Registration Failed: " + e.getMessage());

        }

        // Close Scanner
        scanner.close();
    }
}


