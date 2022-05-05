package com.java.learning.lessons.white.rabbit.lesson21;

// Наследование - отношение между классами при котором характеристики одного класса передаются другому классу без
// необходимости их повторного определения

public class Crow extends Birds {
    public Crow(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("I can fly");
    }
}
