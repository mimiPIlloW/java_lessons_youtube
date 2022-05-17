package com.java.learning.lessons.white_rabbit.lesson10;

public class ControlOperators {
    int a = 1, b = 3;
    boolean value = true;

    public void foo() {
        if (a < b) {
            System.out.println("True");
        }
        if (a == b) {
            System.out.println("d");
        } else {
            System.out.println("False");
        }
    }

    public void foo1() {
        if (value) {
            System.out.println("True");
            a++;

            if (a < b) {
                System.out.println("Yes");
            }
        } else {
            System.out.println("False");
        }
    }

    public void foo2() {
        if (a > b) {
            System.out.println("A");
        } else if (a == b) {
            System.out.println("B");
        } else {
            System.out.println("False");
        }
    }
}
