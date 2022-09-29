package com.java.learning.lessons.java.lessons1_50.lesson7;

public class Human {
    int age = 20;

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getAge());
        System.out.println(human.getAge1(3, 4.3, true));
    }

    int getAge() {
        return age;
    }

    double getAge1(int i, double d, boolean bool) {
        return i + d;
    }
}
