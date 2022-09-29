package com.java.learning.lessons.java.lessons1_50.lesson14;

public class ExampleClass {
    void method() {
        Car car = new Ferrari();
        car.run();
        car.stop();
    }
}

abstract class Car {
    int speed;

    abstract void run();

    void stop() {
        speed = 0;
        System.out.println("stop" + speed);
    }
}

class Ferrari extends Car {
    @Override
    void run() {
        speed = 25;
        System.out.println("speed" + speed);
    }
}
