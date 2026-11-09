
package com.joysistvi.day22.inheritance;

public class Pen {

    // Private data members
    private String brand;
    private String color;
    private double weightInGrams;

    // Parameterized constructor
    public Pen(String brand, String color, double weightInGrams) {
        this.brand = brand;
        this.color = color;
        this.weightInGrams = weightInGrams;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    // Write method
    public void write() {
        System.out.println("Writing with a pen.");
    }

    // toString method
    @Override
    public String toString() {
        return "Brand: " + brand +
                "\nColor: " + color +
                "\nWeight: " + weightInGrams + " grams";
    }
}

