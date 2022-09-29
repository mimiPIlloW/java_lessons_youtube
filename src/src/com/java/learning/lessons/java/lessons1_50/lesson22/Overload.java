package com.java.learning.lessons.java.lessons1_50.lesson22;

public class Overload {
    int addTwoDigits(int a, int b){
        return a + b;
    }
    double addTwoDigits(double a, double b){
        return a + b;
    }
    protected final double addTwoDigits() throws RuntimeException{
        return 4;
    }

    public static void main(String[] args) throws Exception {
        Overload overload = new Overload();
        System.out.println(overload.addTwoDigits(5,7));
        System.out.println(overload.addTwoDigits(4.34,7.65));
        System.out.println();
    }
}

