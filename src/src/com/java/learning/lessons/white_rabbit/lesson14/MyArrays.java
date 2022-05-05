package com.java.learning.lessons.white.rabbit.lesson14;

public class MyArrays {

    // создание массива с помощью new и с помощью прямой инициализации

    int[] array = new int[3]; //(Примитивный тип)

    Candy[] box1 = new Candy[5]; /*(Ссылочный тип) Конфеты которые хранятся в коробке для этого нам нужно написать его имя []-(хранилище)
    конфеты которые будут лежать в хранилище после = мы создаем данный массив и говорим что там будет 5 конфет*/

    int[] array2 = {10, 3, 7}; //сразу с инициализацией говорим какие числа будут хранится в данном массиве типом int

    Candy candyFirst = new Candy();
    Candy candySecond = new Candy();
    Candy candyThird = new Candy();

    Candy[] box2 = {candyFirst, candySecond, candyThird};

    Candy[] box3;

    public void foo() {
//         box 1
        Candy candy = new Candy();
        box1[0] = candy;
        System.out.println(box1[0]);

        System.out.println(box1[0]); // будет null так как наши ссылки ни на что не указывают
        System.out.println();
    }

    public void foo1() {
//        box2
        System.out.println(box2[2]);
        System.out.println();
    }

    public void foo2() {
//        array2
        System.out.println(array2[1]);

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println();
    }

    public void foo3() {
        System.out.println(array[0]); // все элементы будут равны 0
        System.out.println();
    }

    // многомерные массивов в JAVA не сущ но есть массивы массивов
    public void foo4() {
        int[][] array3 = new int[2][2];
        int[][] array4 = {{2, 3}, {3, 4}};
        int[][][] array5 = {{{2, 3}, {3, 4}}, {{1, 3}, {3, 6}}, {{2, 4}, {5, 3}}};

        System.out.println(array4[1][0]);
        System.out.println(array5[2][1][0]);
    }
}
