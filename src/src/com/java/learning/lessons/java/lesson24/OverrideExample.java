package com.java.learning.lessons.java.lesson24;

class Parents {
    int method() {
        return 1;
    }

    Parents method1() {
        return new Parents();
    }
}

class Child extends Parents {
    @Override
    int method() {
        return 2;
    }

    @Override
    Child method1() {
        return new Child();
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Parents parents = new Parents();
        System.out.println(parents.method());
        System.out.println(parents.method1());

        Parents child = new Child();
        System.out.println(child.method());
        System.out.println(child.method1());
    }
}
