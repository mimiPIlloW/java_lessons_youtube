package com.java.learning.lessons.java.lessons1_50.lesson49;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Book {
    String author;
    String name;
}

class Ticket {
    int number;
    String libraryName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return number == ticket.number && Objects.equals(libraryName, ticket.libraryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, libraryName);
    }
}

public class Main1 {
    int value;

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.number = 1123;
        Book book = new Book();
        book.author = "Karnegy";
        book.name = "how to get friends";
        Map<Ticket, Book> library = new HashMap();
        library.put(ticket, book);

        Ticket ticket2 = new Ticket();
        ticket2.number = 1123;

        Book karnegyBook = library.get(ticket2);
        System.out.println(karnegyBook.author);
    }
}
