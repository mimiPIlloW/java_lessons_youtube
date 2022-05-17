package com.java.learning.lessons.white_rabbit.lesson17;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.go();
        int km2 = bus.showKm(); // присваем значение 65 другой переменной km2
        System.out.println(km2);
        System.out.println(bus.showKm());
        System.out.println(bus.showKm2());
        System.out.println(bus.showReturnObject());
        // хотив вывести в консоль какое то число
        int km = 45;
        bus.showAccept(km);
        //ссылочную переменную
        String name = "AAA";
        bus.showAccept2(name);
        int a = 12;
        String b = "qwe";
        bus.showAccept3(a, b);
    }
}
