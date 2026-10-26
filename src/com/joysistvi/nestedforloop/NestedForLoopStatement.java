package com.joysistvi.nestedforloop;

import java.util.Scanner;

public class NestedForLoopStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of rows: ");
        int rowsInput = scanner.nextInt();


        for (int i = 1; i <=rowsInput; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        scanner.close();
    }

}
