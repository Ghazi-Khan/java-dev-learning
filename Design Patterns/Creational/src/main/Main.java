package main;

import builder.pattern.Book;

import java.time.Year;

public class Main {

    public static void main(String[] args) {
        Book book = new Book
                .Builder("123345678", "Java Ref")
                .setAuthor("Ghazi")
                .setDescription("Java reference book")
                .setPublished(Year.of(2022))
                .build();

        System.out.println(book.getIsbn());
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getDescription());
        System.out.println(book.getPublished());
    }
}
