package com.java.learning.lessons.white.rabbit.lesson13;

public class ForLoop {

//    public void foo() {
//        for (; ; ) {                             // while (true) {}
//            System.out.println("a");
//        }
//    }

    public void foo1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(); // одинаково

        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
        }

        System.out.println();

        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
    }

    int[] array = {1, 2, 3};

    public void foo2() {
        for (int element : array) {
            System.out.println(element);
        }

        System.out.println("Одинаковые просто верхнее короче");

        for (int w =0; w<array.length; w++){
            System.out.println(array[w]);
        }
    }
}
