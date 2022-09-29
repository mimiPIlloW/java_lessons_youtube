package com.java.learning.lessons.java.lessons1_50.lesson39;

public class Main {
    public static void main(String[] args) {
        method();
        System.out.println();
        method1();
    }

    private static void method() {
        int[] arr = {1, 2, 3};
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i]);
            i++;
        }
    }

    private static void method1() {
        int[] arr = {1, 2, 3};
        int i = 0;
        do {
            System.out.print(arr[i]);
            i++;
        } while (false);
    }
}
