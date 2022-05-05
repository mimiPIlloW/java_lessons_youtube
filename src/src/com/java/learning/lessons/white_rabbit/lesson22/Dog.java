package com.java.learning.lessons.white.rabbit.lesson22;

// Полиморфизм это свойство позволяющее с помощью одного интерфейса обращаться к общему класса действий
// Это способность определять версию переопределенного метода в зависимости от типа
// Статический полиморфизм это - у нас есть метод walk который есть у собак и мы создадим такой же метод только у овчарок
public class Dog {
    private String name;

    public void walk(){
        System.out.println("HO HO HO");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
