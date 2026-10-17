package com.joysistvi.day3.variable;

public class Activity1_Pascual {

    public static void main(String[] args) {

        // Variable Initialization with Declaration
        boolean isAvailable = true;             // Boolean (true or false)
        byte totalStudents = 25;                // Byte (Range: -128 to 127)
        short totalTrainingDays = 40;           // Short (Range: -32,768 to 32,767)
        int totalTrainingHours = 240;           // Integer (Range: -2,147,483,648 to 2,147,483,647)
        long daysCompleted = 2;                 // Long (Range: -9,223,372,036,854,775,808 to 9,223,273,036,036,854,775,807)
        float internetAllowance = 1_000.00f;    // Float (6 to 7 decimal digits)
        double GWA = 98.3252d;                  // Double (15 to 16 decimal digits)
        char gradeRemarks = 'P';                // Character (Single character/letter or ASCII values)
        String courseName = "Programming (Java) NC III"; // String, Sequence of Characters

        // Displaying the values as output using 'println'
        System.out.println("\t\t\t\tCOURSE DESCRIPTION\t\t\t\t\t\t(DATA TYPE)");
        System.out.println("[]Course Name:\t\t\t\t" + courseName +"\t(String)");
        System.out.println("[]Available:\t\t\t\t" + isAvailable + "\t\t\t\t\t\t(Boolean)");
        System.out.println("[]Total Training Hours:\t\t" + totalTrainingHours + " hours" + "\t\t\t\t\t(Short)");
        System.out.println("[]Total Training Days:\t\t" + totalTrainingDays + " days" + "\t\t\t\t\t\t(Integer)");
        System.out.println("[]Total Number of Slots:\t" + totalStudents + "\t\t\t\t\t\t\t(Byte)");
        System.out.println();
        System.out.println("[]Internet Allowance:\t\t" + "P" + String.format("%.2f", internetAllowance) + "\t\t\t\t\t(Float)");
        System.out.println("[]Days Completed:\t\t\t" + daysCompleted + " days" + "\t\t\t\t\t\t(Long)");
        System.out.println("[]Course Rating:\t\t\t" + String.format("%.2f", GWA) + "%" + "\t\t\t\t\t\t(Double)");
        System.out.println("[]Rating Remarks:\t\t\t" + gradeRemarks + "\t\t\t\t\t\t\t(Character)");

    }
}

/*
    \t - insert a tab in the output, used mainly for visual appearance of the output
    String.format() - used to format the no. of decimal places displayed
 */