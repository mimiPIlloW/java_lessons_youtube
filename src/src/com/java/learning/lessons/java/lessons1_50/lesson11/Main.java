package com.java.learning.lessons.java.lessons1_50.lesson11;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Car toyota = new Toyota();
        main.useCar(toyota);
    }

    void useCar(Car car) {
        car.driving();
        System.out.println(car.getNuOfSeeds());
    }
}
