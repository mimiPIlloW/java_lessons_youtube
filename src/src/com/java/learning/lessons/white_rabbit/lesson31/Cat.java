package com.java.learning.lessons.white.rabbit.lesson31;

import java.io.Serializable;

public class Cat implements Serializable {
    // Serializable - выделятся место под объект и его поля заполняются из потока конструктор не используется

    private String name;
//    private static  String a;  данные поля не могут быть предметом сериализация при сериализации
//    private  transient String b;  данные поля не могут быть предметом сериализация при сериализации

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
