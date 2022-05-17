package com.java.learning.lessons.white_rabbit.lesson16;

public class Modifiers { // private       default      protected    public
    //применяются как к классу так и к его состовляющим (полям,методам,конуструкторам)

    // public
    public String name;

    public Modifiers() {
    }    // public можно обратиться из любого класса

    public void foo() {
    }

    // privat не применим к обычному классу но применим к ложному

    //ложные классы(внутренние) доступен только в классе где прописан
    private class FirstClass {
        public String color;
    }

    public void foo1() {
        FirstClass firstClass = new FirstClass();
        firstClass.color = "Black";
    }

    // privat поля и privat методы не доступны в других классах
    // так же он применим и к конструктору. Данный модификатор доступа к конструктору применим для того чтобы закрыть
    // возможность создания объекта класса
    // https://javarush.ru/groups/posts/589-patternih-i-singleton--dlja-vsekh-kto-vpervihe-s-nimi-stolknulsja реализация с
    // помощью static метода и privat конструктора
    // Если конструктор является privat
////    private Modifiers() {
////    }

    // В нашем классе мы модем создать объект нашего класса
    // если мы используем статик метод то мы сможем создать объект нашего класса не используя оператор new
    public static void foo2() {
        Modifiers modifiers = new Modifiers();
   }

    // privat методы пишут для того чтобы выделить какой то общий функционал в данный метод и данный метод скрыть от общего доступа
    // например
////    private  static void foo3(){
////        Modifiers modifiers = new Modifiers();
////    }
////    public void show(){
    // данный приватный метод мы можем использовать в данном методе show
////        foo3();
////    }

    // default
    // данный модификатор не пишется
//    String name;
//    Modifiers(){}
//    void foo4(){}
    //Отличия public и default в том что класс и его состовляющие доступны только в данном пакете

    // protected
    // применяется только к вложенным или внутренним классам
////    protected class SecondClass{}
    // если наш класс является наследником другого класса и в этом классе были поля методы конструкторы
    // с модификатором protected то наши поля методы конструкторы будут доступны нам даже если наш класс будет
    // находиться в другом пакете
}