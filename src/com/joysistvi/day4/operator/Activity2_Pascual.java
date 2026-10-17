package com.joysistvi.day4.operator;

public class Activity2_Pascual {

    public static void main(String[] args) {

        // Given variables and values
        double income = 50_000;
        double foodAllowance = 15_000;
        double transportation = 2_500;
        double rent = 4_500;
        double utilityBill = 3_500;

        System.out.println("******* EXPENSE TRACKER *******"); // Output header

        // Calculate each expense as a percentage of the total income
        // Formula: (Expense / Income) * 100
        System.out.printf("Food Allowance: %.1f%%%n", (foodAllowance / income) * 100);
        System.out.printf("Transportation: %.1f%%%n", (transportation / income) * 100);
        System.out.printf("Rent: \t\t\t%.1f%%%n", (rent / income) * 100);
        System.out.printf("Utility Bill: \t%.1f%%%n", (utilityBill / income) * 100);
        System.out.println();

        // Calculate and display the remaining balance after deducting all the expenses from the income
        // Formula: Income - Total Expenses
        double incomeAfterExpenses = income - (foodAllowance + transportation + rent + utilityBill);
        System.out.printf("Remaining Balance: P %.2f%n", incomeAfterExpenses);

    }
}
