package com.java.learning.lessons.white_rabbit.lesson15;

public class Flower {
    String name; // переменные в классе
    String color;

    public Flower() {
    }

    public Flower(String myName, String myColor) { // Конструктор принимает две строки
        name = myName; // присваиваем переменную которая принимает конструктор
        color = myColor;
    }
}
