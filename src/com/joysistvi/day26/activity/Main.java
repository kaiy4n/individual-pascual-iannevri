package com.joysistvi.day26.activity;


public class Main {

    public static void testAccount(Account account) {
        account.displayAccountInfo();
    }

    public static void main(String[] args) {

        // Creating Objects
        SavingsAccount savings = new SavingsAccount(
                "1001",
                "Juan Dela Cruz",
                5000.0
        );

        CheckingAccount checking = new CheckingAccount(
                "2001",
                "Maria Santos",
                1000.0
        );

        // Display Account Information
        System.out.println("===== ACCOUNT INFORMATION =====");

        testAccount(savings);
        testAccount(checking);

        // Savings Account Transactions
        System.out.println("===== SAVINGS ACCOUNT TRANSACTIONS =====");

        savings.deposit(1000);

        savings.withdraw(5800);

        savings.deposit(500, "Birthday gift");

        savings.withdraw(1500, "Rent");

        // Checking Account Transactions
        System.out.println("\n===== CHECKING ACCOUNT TRANSACTIONS =====");

        checking.withdraw(2500);

        checking.withdraw(1000);

        // Money Transfer
        System.out.println("\n===== MONEY TRANSFER =====");

        savings.transfer(checking, 1000);

        // Add Interest
        System.out.println("\n===== ADDING INTEREST =====");

        savings.addInterest();

        // Final Account Balances
        System.out.println("\n===== FINAL ACCOUNT BALANCES =====");

        testAccount(savings);
        testAccount(checking);
    }
}

/*
OOP CONCEPTS:

1. Encapsulation:
   Account - private data members, getters, and setters.

2. Inheritance:
   SavingsAccount extends Account.
   CheckingAccount extends Account.

3. Polymorphism (Overriding):
   displayAccountInfo(), deposit(), withdraw(), transfer().
   Both SavingsAccount and CheckingAccount override interface methods.

4. Polymorphism (Overloading):
   SavingsAccount - deposit(double, String), withdraw(double, String).
   CheckingAccount - deposit(double, String), withdraw(double, String).

5. Abstraction (Abstract Class):
   Account - abstract class and displayAccountInfo().

6. Abstraction (Interfaces):
   Transaction, Transferable, InterestBearing, Overdraftable.

7. Constants:
   SavingsAccount - MIN_BALANCE.
   InterestBearing - INTEREST_RATE.
   Overdraftable - OVERDRAFT_LIMIT.
*/
