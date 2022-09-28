package com.java.learning.lessons.java.lesson26;

class Parent {
    Parent() {
        System.out.println("PC");
    }
}

public class InitExample extends Parent {
    static {
        System.out.println("static init block");
    }

    {
        System.out.println("init block1");
    }

    {
        System.out.println("init block2");
    }

    InitExample() {
        super();
        {
            System.out.println("init block3");
        }
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new InitExample();
    }
}
