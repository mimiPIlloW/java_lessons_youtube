package com.java.learning.lessons.java.lessons1_50.lesson18;

public class Example {
    // static final abstract native strictfp synchronized
    static int i = 5;

    static void method(int a, int... k) {
        System.out.println(i + a);
        for (int h : k){
            System.out.print(h + " ");
        }
    }

    static int method1(){
        return 5;
    }
}

class OtherClass extends Example {
    public static void main(String[] args) {
        method(5 , 45,345,5,435,53,345);
        System.out.println("\n");
        System.out.println(method1());
    }
}

