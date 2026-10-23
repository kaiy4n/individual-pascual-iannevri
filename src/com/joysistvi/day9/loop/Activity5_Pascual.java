package com.joysistvi.day9.loop;

import java.util.Scanner;

public class Activity5_Pascual {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int product;                                                                // Initialize variable

        System.out.print("Enter the multiplication table you want to display: ");   // Prompts for number input
        int numInput = scanner.nextInt();                                           // Accepts number input

        System.out.println();
        System.out.println("Multiplication Table of " + numInput);                  // Multiplication table header

        for (int i = 1; i <= 10; i++) {                                             // For loop

            product = i * numInput;                                                 // Getting the product
            System.out.println(numInput + " x " + i + " = " + product);             // Display output

        }

        scanner.close();
    }
}


