
package com.joysistvi.day22.inheritance;

public class Ballpen extends Pen {

    // Additional data member
    private double pointSize;

    // Parameterized constructor
    public Ballpen(String brand, String color,
                   double weightInGrams, double pointSize) {

        super(brand, color, weightInGrams);
        this.pointSize = pointSize;
    }

    // Getter and Setter
    public double getPointSize() {
        return pointSize;
    }

    public void setPointSize(double pointSize) {
        this.pointSize = pointSize;
    }

    // Override write method
    @Override
    public void write() {
        System.out.println("Writing smoothly with a ballpen.");
    }

    // Override toString method
    @Override
    public String toString() {
        return "Type: Ballpen\n" +
                super.toString() +
                "\nPoint Size: " + pointSize + " mm";
    }
}
