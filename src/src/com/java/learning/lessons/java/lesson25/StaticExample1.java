package com.java.learning.lessons.java.lesson25;

public class StaticExample1 {
    static StaticExample1 staticExample1 = new StaticExample1();
    static int n = 4;
    static int i = returnIntStatic();

    static int k = 3;
    int j = returnInt();

    static {
        System.out.println("static");
    }

    {
        System.out.println("clean");
    }

    StaticExample1() {
        System.out.println("Constructor");
    }

    private static int returnIntStatic() {
        System.out.println(n);
        System.out.println(k);
        System.out.println("return static int");
        return 1;
    }

    private int returnInt() {
        System.out.println("return int");
        return 2;
    }

    public static void main(String[] args) {
        new StaticExample1();
    }
}
