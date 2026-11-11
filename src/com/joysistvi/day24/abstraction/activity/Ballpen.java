package com.joysistvi.day24.abstraction.activity;

public class Ballpen extends Pen implements Refillable, Clickable {

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

    // Implement abstract write() method
    @Override
    public void write() {
        System.out.println("Writing smoothly with a ballpen.");
    }

    // Implement Refillable method
    @Override
    public void refill() {
        System.out.println("Replacing the ballpen ink refill.");
    }

    // Implement Clickable method
    @Override
    public void click() {
        System.out.println(CLICK_SOUND + " The ballpen tip comes out.");
    }

    // toString method
    @Override
    public String toString() {
        return "Type: Ballpen\n" +
                super.toString() +
                "\nPoint Size: " + pointSize + " mm";
    }
}

