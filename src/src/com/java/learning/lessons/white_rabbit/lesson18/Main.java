package com.java.learning.lessons.white_rabbit.lesson18;

public class Main {
    public static void main(String[] args) {
        StaticVariablesAndMethods staticVariablesAndMethods = new StaticVariablesAndMethods();
        StaticVariablesAndMethods staticVariablesAndMethods1 = new StaticVariablesAndMethods();
        StaticVariablesAndMethods staticVariablesAndMethods2 = new StaticVariablesAndMethods();

        staticVariablesAndMethods.variable = 5;
        staticVariablesAndMethods1.variable = 7;

        System.out.println(staticVariablesAndMethods.variable);
        System.out.println(staticVariablesAndMethods1.variable);
        System.out.println(staticVariablesAndMethods2.variable);
        // будет три 7 так как static означает что данное поле является полем класса и оно одинаково для всех объектов
        // сначала мы присвоили 5 потом присвоили 7 и осталось 7
        // такое обращение к переменным некорректно
        // если есть static переменная или методы необходимо к ним обращаться через сам класс
        StaticVariablesAndMethods.variable = 5; // правильное
        //
        StaticVariablesAndMethods.foo();
    }
}
