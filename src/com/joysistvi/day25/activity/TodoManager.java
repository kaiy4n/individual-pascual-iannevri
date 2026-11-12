package com.joysistvi.day25.activity;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoManager {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        while(true) {

            showMenu();
            choice = getInput("Enter your choice: ");

            switch(choice) {

                case 1:
                    addTask();
                    break;

                case 2:
                    viewTasks();
                    break;

                case 3:
                    updateTask();
                    break;

                case 4:
                    removeTask();
                    break;

                case 5:
                    clearTasks();
                    break;

                case 0:
                    System.out.println("Exiting TodoManager. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }

    public static void showMenu() {

        System.out.println("--- Todo Manager Menu ---");
        System.out.println("1. Add a task");
        System.out.println("2. View all tasks");
        System.out.println("3. Update a task");
        System.out.println("4. Remove a task");
        System.out.println("5. Clear all tasks");
        System.out.println("0. Exit");
    }

    public static int getInput(String prompt) {

        while(true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch(NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a number.\n");
            }
        }
    }

    public static void addTask() {

        System.out.print("Enter task: ");
        String task = scanner.nextLine().trim();

        if(task.isEmpty()) {
            System.out.println("Task cannot be empty.\n");
            return;
        }

        tasks.add(task);
        System.out.println("Task added successfully!\n");
    }

    public static void viewTasks() {

        if(tasks.isEmpty()) {
            System.out.println("No tasks yet.\n");
            return;
        }

        System.out.println("--- Your Tasks ---");
        for(int i = 0; i  < tasks.size(); i++) {
            System.out.println((i+1) + ". " + tasks.get(i));
        }
        System.out.println();
    }

    public static void updateTask() {

        if(tasks.isEmpty()) {

            System.out.println("No tasks to update.\n");
            return;
        }

        viewTasks();

        int taskNumber = getInput("Enter task number to update: ");
        if(taskNumber < 1 || taskNumber > tasks.size()) {

            System.out.println("Invalid task number.\n");
            return;
        }

        System.out.print("Enter the new task: ");
        String newTask = scanner.nextLine().trim();
        if(newTask.isEmpty()) {
            System.out.println("Task cannot be empty.\n");
            return;
        }

        tasks.set(taskNumber - 1, newTask);
        System.out.println("Task updated successfully!\n");

    }

    public static void removeTask() {

        if(tasks.isEmpty()) {
            System.out.println("No tasks to remove.\n");
            return;
        }

        viewTasks();

        int taskNumber = getInput("Enter task number to remove: ");
        if(taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.\n");
            return;
        }

        tasks.remove(taskNumber - 1);

        System.out.println("Task removed successfully!\n");
    }

    public static void clearTasks() {

        if(tasks.isEmpty()) {
            System.out.println("No tasks to clear.\n");
            return;
        }

        tasks.clear();
        System.out.println("All tasks cleared successfully!\n");
    }
}
