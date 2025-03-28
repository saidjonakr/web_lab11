package com.example.lab11.entities;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Book: %s by %s ($%.2f)", title, author, price);
    }
}
