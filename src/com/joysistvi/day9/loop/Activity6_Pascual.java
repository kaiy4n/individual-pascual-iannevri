package com.joysistvi.day9.loop;

public class Activity6_Pascual {

    public static void main(String[] args) {

        int product;                                                    // Initialize variable

        for (int i = 1; i <= 10; i++) {                                 // For loop

            if(i != 1) {                                                // Checks if i is not 1 (For Display Format)
                System.out.println();                                   // Adds a new line for every iteration except the first
            }

            System.out.println("Multiplication Table of " + i);         // Multiplication table header

            for (int j = 1; j <= 10; j++) {                             // Nested For loop

                product = i * j;                                        // Getting the product
                System.out.println(i + " x " + j + " = " + product);    // Displaying the multiplication table

            }

        }

    }
}
