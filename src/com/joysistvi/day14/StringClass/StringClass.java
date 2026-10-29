package com.joysistvi.day14.StringClass;

import java.util.Scanner;

public class StringClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String correctUsername = "iannevribp2004";
        String correctPassword = "Pogiako123";

        for (int tryCounter = 1; tryCounter <= 5; tryCounter++) {

            System.out.print("Enter Username: ");
            String usernameInput = scanner.nextLine();

            System.out.print("Enter Password: ");
            String passwordInput = scanner.nextLine();

            if(usernameInput.equals(correctUsername) && passwordInput.equals(correctPassword)) {
                System.out.println("Logged in Successfully.");
                System.out.println("Welcome!");

                scanner.close();
                return;
            } else {
                System.out.println();
                System.out.println("Invalid username or password. Please try again.");
                System.out.println("Attempts remaining: " + (5 - tryCounter));
                System.out.println();
            }
        }

        System.out.println("Limit of 5 tries already reached. Please try again later.");

        scanner.close();
    }

}
