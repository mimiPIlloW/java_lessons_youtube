package com.java.learning.lessons.java.lessons1_50.lesson19;

public class ConstructorExample {
    int i;
    ConstructorExample(){
        System.out.println("Run");
    }
    ConstructorExample(String hello, int iValue){
        this.i = iValue;
        System.out.println(hello);
    }
}

class Run{
    public static void main(String[] args) {
        ConstructorExample constructorExample = new ConstructorExample();
        ConstructorExample constructorExample1 = new ConstructorExample("Hello", 5);
        System.out.println(constructorExample1.i);

    }
}