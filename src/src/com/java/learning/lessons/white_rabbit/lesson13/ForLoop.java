package com.java.learning.lessons.white_rabbit.lesson13;

public class ForLoop {

//    static public void foo() {
//        for (; ; ) {                             // while (true) {}
//            System.out.println("a");
//        }
//    }

    public void foo1() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }

        System.out.println("\n"); // одинаково

        int a = 0;
        while (a < 10) {
            System.out.print(a);
            a++;
        }

        System.out.println("\n");

        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println("\n");
    }

    int[] array = {1, 2, 3};

    public void foo2() {
        for (int element : array) {
            System.out.print(element);
        }

        System.out.println("\nОдинаковые просто верхнее короче");

        for (int w = 0; w < array.length; w++) {
            System.out.print(array[w]);
        }
    }
}
