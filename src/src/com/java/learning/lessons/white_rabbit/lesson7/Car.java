package com.java.learning.lessons.white_rabbit.lesson7;

public class Car {
    private String color;
    private String model;

    public void showColor() {
        System.out.println(color + " " + model);
    }

    public static void main(String[] args) {
        Car ourBus = new Car();
        Car firstBus = new Car();
        Car secondBus = new Car();
        ourBus.color = "Green";
        ourBus.model = "Baw";
        firstBus.color = "Red";
        firstBus.model = "SMA";
        secondBus.color = "Grey";
        secondBus.model = "Rely";

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
    }
}
