package com.bookstore;

public class Book {
    long ISBNNumber;
    String title;
    String description;
    int price;
    Author author;

    public Book() {
    }

    public Book(long ISBNNumber, String title, String description, int price, Author author) {
        this.ISBNNumber = ISBNNumber;
        this.title = title;
        this.description = description;
        this.price = price;
        this.author = author;
    }


    public void displayDetails() {
        System.out.println("Book{" +
                "ISBNNumber=" + ISBNNumber +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", author=" + author.toString() +
                '}');
    }

    public void setISBNNumber(long ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
