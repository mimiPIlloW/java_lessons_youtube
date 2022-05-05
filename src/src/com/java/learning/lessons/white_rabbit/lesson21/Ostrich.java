package com.java.learning.lessons.white.rabbit.lesson21;

// Наследование - отношение между классами при котором характеристики одного класса передаются другому классу без
// необходимости их повторного определения

public class Ostrich extends Birds {

    public Ostrich(String name) {
        super(name); // super - работа с супер классом можно прописывать только в конструкторе
    }

    public void hideHead() {
        System.out.println("I Ostrich and I scared");
    }
}
