
package com.joysistvi.day22.inheritance;

public class Marker extends Pen {

    // Additional data member
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

    // Override write method
    @Override
    public void write() {
        System.out.println("Writing boldly with a marker.");
    }

    // Override toString method
    @Override
    public String toString() {
        return "Type: Marker\n" +
                super.toString() +
                "\nPermanent: " + permanent;
    }
}

