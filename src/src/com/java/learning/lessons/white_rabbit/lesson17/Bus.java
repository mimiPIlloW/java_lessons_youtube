package com.java.learning.lessons.white_rabbit.lesson17;

// поля и методы

public class Bus {

    // имена переменных являются именами сущ
    public String model, color; // помимо свойст
    public Engine engine; // класс может содержать помимо переменных или полей другие объекты которые является составными частями
    public Transmission transmission;
    public final String SERIAL_NUMBER = "D2091W292E"; // константы ссылочные
    public final int SERIAL_NUMBER_2 = 2091292; // константы приметивного

    // имена методов глаголы. void ничего не возвращает
    public void go() {
        System.out.println("Go");
    }

    // метод возвращает
    public int showKm() {
        int km = 65;
        return km;
    }

    public String showKm2() {
        String str = "70km";
        System.out.println(str);
        return str;
    }

    // так же можно вернуть из нашего метода наш объект engine
    public Engine showReturnObject() {
        engine = new Engine();
        return engine;
    }

    // что данный метод может принимать в себя
    public void showAccept(int km2) { // нужно написать какие параметры данный метод может принимать
        //c этой переменной мы можем тут работать
        km2 += 2;
        System.out.println(km2);
    }

    // как с примитивными мы можем передавать и ссылочные типы
    public void showAccept2(String name2) {
        int age = 12;
        name2 += 2;
        System.out.println(name2 + " " + "age" + " " + age);
    }

    // метод может принимать не только одну переменную
    public void showAccept3(int km3, String name3) {
        System.out.print(km3);
        System.out.print("+");
        System.out.println(name3);
    }
}
