package com.java.learning.lessons.white_rabbit.lesson16;

public class Main {
    public static void main(String[] args) {
        Modifiers modifiers = new Modifiers();
//        public
        modifiers.foo();
        String name = modifiers.name;
//        privat
        modifiers.foo1();
        Modifiers.foo2(); // без использования экземпляра класса
    }
}
