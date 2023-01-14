package com.bookstore;

public class Author {
    String authorName;
    String authorPenName;

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorPenName='" + authorPenName + '\'' +
                '}';
    }

    public Author(String authorName, String authorPenName) {
        this.authorName = authorName;
        this.authorPenName = authorPenName;
    }
}
