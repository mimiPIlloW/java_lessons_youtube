package com.java.learning.lessons.java.lesson27;

public class ArrayExample {
    public static void main(String[] args) {
        Object[] b = new Object[5];
        int[] a = new int[5];
        a[0] = 12;
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }

        System.out.println();

        int[] j = new int[]{4, 2, 65};
        for (int h = 0; h < j.length; h++) {
            System.out.print(j[h] + " ");
        }

        System.out.println();
        method(new int[]{1, 4, 2});
    }

    static void method(int[] p) {
        for (int x = 0; x < p.length; x++) {
            System.out.print(p[x] + " ");
        }
    }
}
