package com.java.learning.lessons.java.lessons1_50.lesson29;

public class OverloadingExmpl {
    public static void main(String[] args) {
        OverloadingExmpl overloadingExmpl = new OverloadingExmpl();
        short b = 5;
        overloadingExmpl.method(b);
        overloadingExmpl.method((long) b);
    }

    void method(int i) {
        System.out.println("int");
    }

    void method(long i) {
        System.out.println("long");
    }

    void method(Integer i) {
        System.out.println("Integer");
    }

    void method(double i) {
        System.out.println("double");
    }

    void method(byte... i) {
        System.out.println("byte");
    }

    void method(byte i) {
        System.out.println("byte");
    }

    void method(Byte i) {
        System.out.println("long");
    }

    void method(Object i) {
        System.out.println("long");
    }

    void method(Object... i) {
        System.out.println("long");
    }
}
