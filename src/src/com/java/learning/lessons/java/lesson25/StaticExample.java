package com.java.learning.lessons.java.lesson25;

public class StaticExample {
    static int a = 6;
    int b;
    static {
        System.out.println("Static");
    }
    {
        System.out.println("Initializer");
    }
    StaticExample(){
        System.out.println("Constructor");
    }
    static void staticMethod(){
        System.out.println("A");
        System.out.println(a);
    }

    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        StaticExample staticExample1 = new StaticExample();
        staticExample.b = 1;
        staticExample1.b = 2;
        System.out.println(staticExample.b);
        System.out.println(staticExample1.b);
        ///////////////////////////////
        System.out.println(StaticExample.a);
    }
}
