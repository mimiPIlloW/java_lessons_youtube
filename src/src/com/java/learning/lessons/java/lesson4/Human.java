package com.java.learning.lessons.java.lesson4;

public class Human {
    int age;
    double weight;

    public static void main(String[] args) {
        Human human = new Human();
        human.byBread();
        human.byMilk();
        human.age(12);
    }

   void age(int age){
       System.out.println(age);
    }
    void byMilk() {
        System.out.println("By milk");
    }

    void byBread() {
        System.out.println("By bread");
    }
}
