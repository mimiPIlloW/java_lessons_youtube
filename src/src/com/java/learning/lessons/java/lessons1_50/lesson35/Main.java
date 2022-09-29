package com.java.learning.lessons.java.lessons1_50.lesson35;

import java.util.List;

public class Main extends Object {
    public static void main(String[] args) {
        Main main = new Main();

        int a = (5 > 6) ? 1 : 2;
        System.out.println(a);

        System.out.println(main instanceof Object);
        System.out.println(main instanceof List);

        System.out.println("" + 5 + 6);

    }
}
