package com.joysistvi.day13.multidimensionalarray;

import java.util.Scanner;

public class Activity9_Pascual {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================" );
        System.out.println("\t\tAverage Calculator");
        System.out.println("==================================" );

        System.out.print("Enter number of students: ");                     // Prompts for number of students
        int numberStudents = scanner.nextInt();
        System.out.print("Enter number of subjects: ");                     // Prompts for number of subjects
        int numberSubjects = scanner.nextInt();

        scanner.nextLine();                                                 // Consumes the \n after the nextInt()

        System.out.println();

        String[] studentNames = new String[numberStudents];                 // Initialize array for student names
        String[] subjectNames = new String[numberSubjects];                 // Initialize array for subject names
        int[][] studentGrades = new int[numberStudents][numberSubjects];    // Initialize 2D array for student grades

        System.out.println("Enter subject names: ");                        // Prompts for subject names
        for (int i = 0; i < subjectNames.length; i++) {                     // Iterates based on number of subjects
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = scanner.nextLine();
        }

        for (int j = 0; j < studentNames.length; j++) {                     // Iterates based on number of students
            System.out.println();
            System.out.print("Name of Student " + (j + 1) + ": ");          // Prompts for student name
            studentNames[j] = scanner.nextLine();
            System.out.println("Enter grades for each subject: ");          // Prompts for grades per subject

            for (int k = 0; k < subjectNames.length; k++) {                 // Iterates based on number of subjects
                System.out.print(subjectNames[k] + ": ");
                studentGrades[j][k] = scanner.nextInt();
            }
            scanner.nextLine();
        }

        System.out.println();
        System.out.println();
        System.out.println("==================================");           // Display Grades Report
        System.out.println("\t\tGrades Report");
        System.out.println("==================================");

        System.out.printf("%-20s", "Student");                              // Left-align, 20 characters

        for (int l = 0; l < subjectNames.length; l++) {                     // Display Subjects
            System.out.printf("%-15s", subjectNames[l]);                    // Left-align, 15 characters
        }

        System.out.printf("%-10s%n", "Average");                            // Left-align, 10 characters

        for (int i = 0; i < numberSubjects + 1; i++) {
            System.out.print("------------------------");
        }

        System.out.println();

        for (int m = 0; m < studentGrades.length; m++) {                    // Display grades and calculate averages
            int total = 0;
            System.out.printf("%-20s", studentNames[m]);                    // Left-align, 20 characters

            for (int n = 0; n < studentGrades[m].length; n++) {
                System.out.printf("%-15d", studentGrades[m][n]);            // Left-align, 15 characters
                total += studentGrades[m][n];
            }
            double average = (double) total / numberSubjects;
            System.out.printf("%-10.2f%n", average);                        // Left-align, 10 characters, 2 decimal places
        }

        scanner.close();
    }

}
