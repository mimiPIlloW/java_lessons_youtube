package com.java.learning.lessons.white_rabbit.lesson12;

public class LoopControl {

   static private boolean value = true;
    static private int a = 5, b = 7;

    static public void foo() {

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

    public static void main(String[] args) {
        foo();
    }
}
