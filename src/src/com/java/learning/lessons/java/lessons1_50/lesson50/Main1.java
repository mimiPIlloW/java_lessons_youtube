package com.java.learning.lessons.java.lessons1_50.lesson50;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        method();
        method1();
    }

    public static void method() {
        ArrayList collection = new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }
    }

    public static void method1() {
        Queue queue = new PriorityQueue();
    }

    public static void method2() {
        Set set = new HashSet();
        set.add("1");
        set.add("2");
        set.add("3");
        for (Object o : set){
            System.out.println(o);
        }
    }
}
