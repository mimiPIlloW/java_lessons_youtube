package com.java.learning.lessons.java.lesson23;

class MyParents {
    MyParents() {
        System.out.println("22222222");
    }
}

public class ConstructorExample extends MyParents {
    ConstructorExample() {
        System.out.println("11111111111");
    }

    public static void main(String[] args) {
        new ConstructorExample();
    }
}
