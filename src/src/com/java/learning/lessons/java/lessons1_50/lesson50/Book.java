package com.java.learning.lessons.java.lessons1_50.lesson50;

import java.util.HashMap;
import java.util.Map;

public class Book {
    String nameAuthor;

    Book(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAuthor='" + nameAuthor + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("1", new Book("aaaaaaaaaaaa"));
        map.put("2", new Book("bbbbbbbbbbbb"));
        map.put("3", new Book("cccccccccccc"));
        System.out.println(map.get("2"));
    }
}
