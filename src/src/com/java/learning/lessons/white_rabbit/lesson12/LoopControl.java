package com.java.learning.lessons.white.rabbit.lesson12;

public class LoopControl {

    boolean value = true;
    int a = 5, b = 7;

    public void foo() {

        while (a < b) {
            System.out.println(a);
            a++;
        }
        System.out.println();
        while (true) {
            System.out.println(a);
            a++;
            break;
        }
        System.out.println();
        do {
            a++;
            System.out.println(a);
        } while (a < b);
    }
}
