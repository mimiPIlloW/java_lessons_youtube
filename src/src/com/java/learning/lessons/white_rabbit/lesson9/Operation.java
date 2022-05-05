package com.java.learning.lessons.white.rabbit.lesson9;

public class Operation {
    Integer a = 5, b = 6, c;
    String str1 = "Hot ", str2 = "Java", result;


    public void foo() {
        c = a + b; // не сложение объектов а сложение приметивных типов после результат присваевается 'c'
        result = str1 + str2;
        System.out.println(c + " " + result);
        System.out.println(Math.PI);
    }
}
