package com.java.learning.lessons.java.lessons1_50.lesson43;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.method(-1);
    }

    public void method(int a) {
        assert (a > 0);
        System.out.println(a);
    }
}
