package com.joysistvi.day6.ifstatement;

import java.util.Scanner;

public class Activity4_Pascual {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");          // Prompt user to input age value
        int age = scanner.nextInt();

        String category = "";                       // Initialize category as String

        // If-else statement
        if(age >= 0 && age <= 100) {                // Verify if input is valid

            // Nested if-else statement
            if (age <= 2) {                         // Baby - 0 to 2
                category = "Baby";
            } else if (age <= 12) {                 // Child - 3 to 12
                category = "Child";
            } else if (age <= 19) {                 // Teenager - 13 to 19
                category = "Teenager";
            } else if (age <= 29) {                 // Young Adult - 20 to 29
                category = "Young Adult";
            } else if (age <= 59) {                 // Adult - 30 to 59
                category = "Adult";
            } else {                                // Seniot - 60 to 100
                category = "Senior";
            }

        } else {                                    // Executes if input is not a value between 0 and 100
            System.out.println("Invalid Input.");                               // Invalid input message
            System.out.println("Please only enter number between 0 and 100");
        }

        System.out.println();
        System.out.println("Age: " + age);              // Display age input
        System.out.println("Category: " + category);    // Display category

    }
}
