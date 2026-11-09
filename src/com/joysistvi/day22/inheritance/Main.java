package com.joysistvi.day22.inheritance;

public class Main {

    public static void main(String[] args) {

        // Create Ballpen object
        Ballpen ballpen1 = new Ballpen(
                "Pilot", "Black", 10.5, 0.5
        );

        // Create Marker object
        Marker marker1 = new Marker(
                "Sharpie", "Blue", 15.0, true
        );

        // Display Ballpen information
        System.out.println("===== BALLPEN =====");
        System.out.println(ballpen1);
        ballpen1.write();

        System.out.println();

        // Display Marker information
        System.out.println("===== MARKER =====");
        System.out.println(marker1);
        marker1.write();
    }
}

