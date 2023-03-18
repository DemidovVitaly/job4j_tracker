package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("Clean code", 256);
        Book book4 = new Book("book name 4", 29);
        Book book2 = new Book("book name 2", 56);
        Book book3 = new Book("book name 3", 233);
        Book[] books = new Book[]{book1, book2, book3, book4};

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getNumber() + "str");
        }
        System.out.println("******");

        Book bookTemp = books[0];
        books[0] = books[3];
        books[3] = bookTemp;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getNumber() + "str");
        }
        System.out.println("******");

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " - " + books[i].getNumber() + "str");
            }
        }
    }
}
