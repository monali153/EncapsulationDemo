package main;

import data.Book;

public class BookImpl {

    public static void main(String[] args) {

        Book object = new Book();

        object.setAuthorName("Herbert Schildth");
        object.setIsbn(1234567890123L);
        object.setYearOfPublishing(2021);
        object.setTitle("Complete Reference 12th Edition");

        System.out.println("object.getTitle() = " + object.getTitle());
        System.out.println("object.getAuthorName() = " + object.getAuthorName());
        System.out.println("object.getYearOfPublishing() = " + object.getYearOfPublishing());
        System.out.println("object.getIsbn() = " + object.getIsbn());

    }

}
