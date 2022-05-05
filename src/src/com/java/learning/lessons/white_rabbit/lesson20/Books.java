package com.java.learning.lessons.white.rabbit.lesson20;

// Особенности

public enum Books {
    CLASSIC(5 , "World"),FANTASY(10, "Doom"); // объект хранит набор полей

    private int i;
    private String name;

    Books(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    // данный класс может иметь обычные методы

    public void foo(){
        System.out.println("It's true");
    }

    public void foo1(){
        System.out.println(Books.CLASSIC.getI());
    }
    // можем работать с полями данного объекта


}
