package com.java.learning.lessons.java.lessons1_50.lesson42;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        new Main().someMethod();
        System.out.println(new Main().someMethod1());
    }

    void someMethod() {
        try {
            Object o = null;
            o.hashCode();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Error");
            //   System.exit(0); // exit
            //  while (true) { }// while
            throw new Error();
        }
    }

    String someMethod1() {
        try {
            System.out.println("try1");
            Object o = null;
            o.hashCode();
            return "try2";
        } catch (NullPointerException e) {
            System.out.println("catch1");
            e.printStackTrace();
            return "catch2";
        } finally {
            System.out.println("finally1");

            return "finally2";
        }
    }

    void someMethod2() {
        try {
            System.out.println("Try");
            throw new Exception();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void someMethod3() { //we can't catch Error
        try {
            System.out.println("Try");
            throw new Error();
        } catch (Error e) {
            System.out.println("catch");
        }
    }

    void someMethod4() {
        try {
            System.out.println("Try");
            throw new MyException();
        } catch (MyException e) {
            System.out.println("catch");
        }
    }

    // 2 kind of

    void someMethod5() { // or throwsIOException 2 or try/catch
        // throw new RuntimeException(); first
        try {
            throw new IOException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void someMethod6() {
        // checked
        // throw new Throwable();
        // throw new Exception();
        // throw new IOException();

        // unchecked
        // throw new Error();
        // throw new RuntimeException();
    }
}
