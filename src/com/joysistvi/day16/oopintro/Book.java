package com.joysistvi.day16.oopintro;

public class Book {

    String title;
    String author;
    int yearPublished;
    double price;

    void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + yearPublished);
        System.out.println("Price: ₱" + price);
    }

}
