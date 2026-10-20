package com.joysistvi.day5.operator;

public class Activity3_Pascual {

    public static void main(String[] args) {

        // *************************************************************************************************************
        // TASK #1
        System.out.println();
        System.out.println("***** TASK 1: Event Entry Check *****");
        int age = 18;                                                       // Variable initialization with declaration
        boolean hasValidID = true;

        String status = (age >= 18 && hasValidID) ? "Yes" : "No";           // Ternary Operator, logical AND operator

        System.out.println("Allowed to enter the event?: " + status);       // Display event entry status
        // *************************************************************************************************************

        // *************************************************************************************************************
        // TASK #2
        System.out.println();
        System.out.println("***** TASK 2: Class Status Check *****");
        boolean isWeekend = true;                                           // Variable initialization with declaration
        boolean isHoliday = false;

        String classStatus = (isWeekend || isHoliday) ? "Yes, no classes." : "No, there is a class today.";

        System.out.println("Are there no classes today?: " + classStatus);  // Display class status
        // *************************************************************************************************************

        // *************************************************************************************************************
        // TASK #3
        System.out.println();
        System.out.println("***** TASK 3: Pass or Fail Check *****");
        int score = 85;                                                     // Variable initialization with declaration

        String gradeStatus = (score >= 75) ? "Passed" : "Failed";           // Ternary operator, greater than or equal to

        System.out.println("Score: " + score);                              // Display score and result
        System.out.println("Result: " + gradeStatus);
        // *************************************************************************************************************

        // *************************************************************************************************************
        // TASK #4
        System.out.println();
        System.out.println("***** TASK 4: Larger Number Check *****");
        int num = 10;                                                       // Variable initialization with declaration
        int num2 = 25;

        int largerNumber = (num > num2) ? num : num2;                       // Ternary operator, greater than

        System.out.println("Number 1: " + num + ", Number 2: " + num2);     // Display the two values

        System.out.println("The larger number is: " + largerNumber);        // Display the larger number between the two
        // *************************************************************************************************************
    }
}
