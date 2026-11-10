package com.joysistvi.day23.polymorphism.activity;

public class Main {

    public static void main(String[] args) {

        // Runtime Polymorphism
        Pen pen1 = new Pen("Pilot", "Black", 10.0);

        Pen pen2 = new Ballpen(
                "Pilot", "Blue", 10.5, 0.5
        );

        Pen pen3 = new Marker(
                "Sharpie", "Red", 15.0, true
        );

        // Display Pen
        System.out.println("--- Pen ---");
        pen1.write();
        pen1.refill();

        System.out.println();

        // Display Ballpen
        System.out.println("--- Ballpen ---");
        pen2.write();
        pen2.refill();

        System.out.println();

        // Display Marker
        System.out.println("--- Marker ---");
        pen3.write();
        pen3.refill();

        System.out.println("\n===== TEST PEN METHOD =====");

        // Calling testPen() for each object
        testPen(pen1);
        testPen(pen2);
        testPen(pen3);

        System.out.println("\n===== METHOD OVERLOADING =====");

        // Calling overloaded methods using a Pen reference
        pen2.write("Hello");
        pen2.write("Hello", 3);

    }

    // Runtime Polymorphism
    public static void testPen(Pen pen) {

        System.out.println("\n" + pen);
        pen.write();
        pen.refill();
    }

    /*
     * Method Overloading (Compile-time): Methods have the same name
     * but different parameters. Java determines which method to call
     * based on the arguments provided during compilation.
     *
     * Method Overriding (Runtime): A child class provides its own
     * implementation of a parent method. Java determines which
     * implementation to execute based on the actual object.
     */
}
