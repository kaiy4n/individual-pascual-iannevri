
package com.joysistvi.day23.polymorphism.activity;

public class Marker extends Pen {

    private boolean permanent;

    // Parameterized constructor
    public Marker(String brand, String color,
                  double weightInGrams, boolean permanent) {

        super(brand, color, weightInGrams);
        this.permanent = permanent;
    }

    // Getter and Setter
    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    // Method Overriding
    @Override
    public void write() {
        System.out.println("Writing boldly with a marker.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the marker ink.");
    }

    // toString method
    @Override
    public String toString() {
        return "Type: Marker\n" +
                super.toString() +
                "\nPermanent: " + permanent;
    }
}
