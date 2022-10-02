package com.java.learning.lessons.java.lessons1_50.lesson44;

public class Main {
    public static void main(String[] args) {
        method();
        System.out.println();
        method1();
    }

    public static void method(){
        String s = ("ABC");
        String s2 = s.concat("def");
        System.out.println(s);
        System.out.println(s2);
    }

    public static void method1(){
        StringBuilder stringBuilder;
        StringBuffer stringBuffer;

        StringBuilder stringBuilder1 = new StringBuilder("ABC");
        stringBuilder1.append("def");
        stringBuilder1.insert(0, "-");
        System.out.println(stringBuilder1);
    }
}
