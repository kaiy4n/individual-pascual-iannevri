package com.joysistvi.day12.array;

import java.util.Scanner;

public class Activity8_Pascual {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);                           // Initialize scanner object

        int[] numbers = new int[5];                                         // Initialize 1D Array
        int sum = 0, highestNumber = 0, lowestNumber = 0;                   // Initialize integer variables
        double average = 0.0d;                                              // Initialize double variable

        System.out.println("Enter " + numbers.length + " numbers: ");       // Prompts for user input
        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();                                 // Accepts input
            sum += numbers[i];                                              // Calculates for sum of array inputs

            if(i == 0) {                                                    // Checks if loop is at first iteration
                lowestNumber = numbers[i];                                  // Gives first array number as lowestNumber
                highestNumber = numbers[i];                                 // and highestNumber
                continue;
            }

            if(numbers[i] < lowestNumber) {                                 // Checks if there is a number lower than
                lowestNumber = numbers[i];                                  // the current lowestNumber

            } else if (numbers[i] > highestNumber) {                        // Checks if there is a number higher than
                highestNumber = numbers[i];                                 // the current highestNumber
            }

        }

        average = sum / numbers.length;                                     // Calculates for average of array inputs

        System.out.println();
        System.out.println("You entered: ");                                // For loop to display user inputs
        for (int j = 0; j < numbers.length; j++) {

            System.out.println("Index " + (j + 1) + ": " + numbers[j]);

        }

        System.out.println();
        System.out.println("Sum = " + sum);                                 // Displays the sum
        System.out.println("Average = " + average);                         // Displays the average
        System.out.println("Highest Number = " + highestNumber);            // Displays the highest number
        System.out.println("Lowest Number = " + lowestNumber);              // Displys the lowers number

        scanner.close();

    }

}
