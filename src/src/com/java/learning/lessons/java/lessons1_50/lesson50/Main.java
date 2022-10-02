package com.java.learning.lessons.java.lessons1_50.lesson50;

import java.awt.*;
import java.awt.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Collection collection = new ArrayList();
        List collection1 = new List();
        Set collection2 = new HashSet();
        Queue collection3 = new PriorityQueue();
        Map map = new HashMap();

        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add(3);
        collection.remove("2");

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("///////////////");
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
