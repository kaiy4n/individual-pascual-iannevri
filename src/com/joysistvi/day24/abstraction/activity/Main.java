package com.joysistvi.day24.abstraction.activity;

public class Main {

    public static void main(String[] args) {

        // Cannot instantiate an abstract class.
        // Pen pen1 = new Pen("Pilot", "Black", 10.0);
        // Error: Pen is abstract; cannot be instantiated.
        // We cannot create a direct Pen object because it is abstract.
        // Instead, we create objects from its concrete child classes.

        // Create Ballpen object
        Ballpen ballpen1 = new Ballpen(
                "Pilot", "Blue", 10.5, 0.5
        );

        // Create Marker object
        Marker marker1 = new Marker(
                "Sharpie", "Red", 15.0, true
        );

        System.out.println("===== TEST PEN =====");

        // Test Pen methods
        testPen(ballpen1);
        testPen(marker1);

        System.out.println("\n===== TEST REFILLABLE =====");

        // Test Refillable interface
        testRefillable(ballpen1);
        testRefillable(marker1);

        System.out.println("\n===== TEST CLICKABLE =====");

        // Only Ballpen implements Clickable
        testClickable(ballpen1);

        // Marker does not implement Clickable.
        // testClickable(marker1);
        // Error: Marker cannot be converted to Clickable.
        // This fails because Marker implements only Refillable,
        // not the Clickable interface.

    }

    // Accepts any object that extends Pen
    public static void testPen(Pen pen) {

        System.out.println("\n" + pen);
        pen.write();
        pen.store();
    }

    // Accepts any object that implements Refillable
    public static void testRefillable(Refillable refillable) {

        refillable.refill();

        System.out.println(
                "Maximum Refills: " + Refillable.MAX_REFILLS
        );
    }

    // Accepts any object that implements Clickable
    public static void testClickable(Clickable clickable) {

        clickable.click();
    }

    /*
     * Abstract Class (extends): A child class inherits attributes
     * and methods from a parent class and must implement its
     * abstract methods if it is not abstract itself.
     *
     * Interface (implements): A class agrees to implement the
     * behaviors declared by an interface. A class can implement
     * multiple interfaces.
     */
}
