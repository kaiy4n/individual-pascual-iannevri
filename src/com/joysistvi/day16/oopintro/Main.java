package com.joysistvi.day16.oopintro;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "Verity";
        book1.author = "Colleen Hoover";
        book1.yearPublished = 2018;
        book1.price = 845.00d;

        Book book2 = new Book();
        book2.title = "Scythe";
        book2.author = "Neil Shusterman";
        book2.yearPublished = 2016;
        book2.price = 1_400.00d;

        Book book3 = new Book();
        book3.title = "The Witch";
        book3.author = "Freida McFadden";
        book3.yearPublished = 2026;
        book3.price = 1_799.00;

        book1.displayBookInfo();
        System.out.println();

        book2.displayBookInfo();
        System.out.println();

        book3.displayBookInfo();
        System.out.println();
    }

}
