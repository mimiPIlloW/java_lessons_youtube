package com.java.learning.lessons.java.lesson10;

public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        int maxSpeed = toyota.getMaxSpeed();
        int nuOfSeeds = toyota.nuOfSeeds;

        System.out.println(maxSpeed + "\n" + nuOfSeeds);
    }
}
