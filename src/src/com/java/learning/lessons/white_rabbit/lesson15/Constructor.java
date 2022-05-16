package com.java.learning.lessons.white_rabbit.lesson15;

public class Constructor {

    // конструктор необходим для того чтобы проинициализировать поля нашего объекта

   static public void foo() {
        Flower flower = new Flower();
        // конструктор по умолчанию
        flower.name = "Ромашка";
        flower.color = "Белая";

        Flower flower1 = new Flower("Роза", "Красная");
        // конструктор который мы сами прописали который принимает поля name, color

        System.out.println(flower.name + " " + flower.color);
        System.out.println(); // выводим свойства нашего объекта
        System.out.println(flower1.name + " " + flower1.color);
    }

    public static void main(String[] args) {
        foo();
    }
}
