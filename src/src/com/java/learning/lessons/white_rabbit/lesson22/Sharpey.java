package com.java.learning.lessons.white.rabbit.lesson22;

// Полиморфизм это свойство позволяющее с помощью одного интерфейса обращаться к общему класса действий
// Это способность определять версию переопределенного метода в зависимости от типа

public class Sharpey extends Dog{

    public void run(){
        System.out.println("GO-GO");
    }

    @Override
    public void walk() {
        System.out.println("I am sharpey");
    }
}
