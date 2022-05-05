package com.java.learning.lessons.white.rabbit.lesson21;

// Наследование - отношение между классами при котором характеристики одного класса передаются другому классу без
// необходимости их повторного определения

//Супер класс
public class Birds {
    private String name;
    private Wings wings;

    // при создании конструктора в супер классе необходимо создать конструкторы и в под классах
    public Birds(String name) {
        this.name = name; // this- говорит о данном классе
    }

    public void walk(){
        System.out.println("Ho ho ho");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
}
