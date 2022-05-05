package com.java.learning.lessons.white.rabbit.lesson34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AAndL {

    public void AL() {
        List<Person> list = new ArrayList<>();

        Person person = new Person("White");
        Person person1 = new Person("Rabbit");

        list.add(person);  // add
        list.add(person1); // add

        Person personFromCollection = list.get(0);  // get
        Person person1FromCollection = list.get(1); // get

        boolean remove = list.remove(person); // delete

        Person person2 = list.get(0); // при обращении происходит смешение
        // если хотим добавить в середину нужно смешать на 1 вправо и если хотим удалить нужно смешать влево на 1

        int size = list.size(); // сколько элементов

        boolean empty = list.isEmpty(); // проверяет пустая ли коллекция

//        boolean b = list.addAll(); // добавление другой коллекции // так же с определенного индекса

//        list.clear(); // чистит коллекцию становится пустой

        boolean contains = list.contains(person); // проверяет находиться ли он в данной коллекции так как его удалили будет false

        int i = list.indexOf(person2); // возвращает индекс нашего объекта

        Object[] objects = list.toArray(); // Можем привести нашу коллекцию к массиву

        Iterator<Person> iterator = list.iterator();
        // поведенческий шаблон проектирования с помощью него мы получаем доступ к элементу нашего листа в данном случае.
        // так же мб объект.

        while (iterator.hasNext()) {
            Person next = iterator.next();
            System.out.println(next);
        }

        System.out.println(personFromCollection);
        System.out.println(person1FromCollection + "\n");
        System.out.println(remove + "\n");
        System.out.println(person2 + "\n");
        System.out.println(size + "\n");
        System.out.println(empty + "\n");
        System.out.println(contains + "\n");
        System.out.println(i + "\n");
        System.out.println("END" + "\n");
    }

    public void LL() {
        LinkedList<Person> list = new LinkedList<>();
        // представляет собой двух связный список (есть доступ(ссылка) к след и прошлый объект), дальше все то же самое что и у AL

        Person person = new Person("White");
        Person person1 = new Person("Rabbit");
        Person person2 = new Person("Good");

        list.add(person);
        list.add(person1);
        list.add(person2);

        Person first = list.getFirst();
        Person last = list.getLast();

        System.out.println(first);
        System.out.println(last);

    }
}
