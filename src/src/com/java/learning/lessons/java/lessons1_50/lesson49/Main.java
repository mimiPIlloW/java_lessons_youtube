package com.java.learning.lessons.java.lessons1_50.lesson49;

public class Main {
    int value;

    public Main(int i) {
        this.value = i;
    }

    public static void main(String[] args) {
        Main main = new Main(5);
        System.out.println(main.toString());
    }

    @Override
    public String toString() {
        return "Main{" +
                "value=" + value +
                '}';
    }
}
