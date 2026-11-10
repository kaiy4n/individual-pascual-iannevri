
package com.joysistvi.day23.polymorphism.activity;

public class Ballpen extends Pen {

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

    // Method Overriding
    @Override
    public void write() {
        System.out.println("Writing smoothly with a ballpen.");
    }

    @Override
    public void refill() {
        System.out.println("Replacing the ballpen ink refill.");
    }

    // toString method
    @Override
    public String toString() {
        return "Type: Ballpen\n" +
                super.toString() +
                "\nPoint Size: " + pointSize + " mm";
    }
}

