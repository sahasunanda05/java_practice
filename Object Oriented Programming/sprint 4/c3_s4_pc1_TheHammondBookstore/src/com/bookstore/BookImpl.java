package com.bookstore;

public class BookImpl {
    public static void main(String[] args) {

        Book book = new Book();
        book.setISBNNumber(9780060834838L);
        book.setDescription("novel");
        book.setPrice(299);
        book.setTitle("The Alchemist");
        book.setAuthor(new Author("Paulo Coelho","PC"));
        book.displayDetails();



    }
}
