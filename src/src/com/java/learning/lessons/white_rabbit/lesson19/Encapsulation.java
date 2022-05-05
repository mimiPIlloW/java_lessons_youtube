package com.java.learning.lessons.white.rabbit.lesson19;

// Инкапсуляция - "принцип, объединяющий данные и код, манипулирующий этими данными, а также защищающий данные от
// прямого доступа и неправильного использования"

public class Encapsulation {

//    private int a = 5, b = 7; // с public меняем на privat
//
//    public int showResult() {
//        return a + b;
//    }

    // Если нам необходимо использовать данные переменные, то есть не только объявлять, но и иметь возможность их изменять
    // у каждого нашего объекта для этого используются методы getter s setter, то есть методы это и есть наши интерфейсы
    // которые мы предлагаем для того чтобы можно было взаимодействовать с нашим ядром.
    // Комментируем все.

    private int a, b;

    public int getA() { // данный метод возвращает нам переменную a которая у нас задана
        return a;
    }

    public void setA(int a) { // (int a) - принимаем методы
        this.a = a; // (this.a)- переменная присваивается тому что принимает
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    // используя getter s setter мы сами говорим что мы хотим чтобы эти переменные были доступны а чтобы они были
    // доступные они должны представляться в виде методов то есть мы предоставляем интерфейс с помощью которого мы
    // сможем работать с данными переменными

    public int maxCat = 10; // если мы хотим дать доступ к нашему числу maxCat и чтобы максимальное число не поменяли
    // то мы должны сделать его privat и использовать get.
    private int maxCat2 = 10;
    private int maxDog2 = 5;

    public int getMaxCat2() {
        return maxCat2;
    }

    public void setMaxCat2(int cat3) {
        this.maxCat2 = cat3;
    }

    public int getMaxDog2() {
        return maxDog2;
    }

}
