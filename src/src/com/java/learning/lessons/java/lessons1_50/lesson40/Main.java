package com.java.learning.lessons.java.lessons1_50.lesson40;

public class Main {
    public static void main(String[] args) {
        method();
        System.out.println();
        method1();
    }

    private static void method() {
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void method1() {
        int[] arr = {1, 2, 3};
        int i = 0;
        for (System.out.println("First"); i < arr.length; System.out.println("End"), i++) {
            System.out.println(arr[i]);
        }
    }
}
