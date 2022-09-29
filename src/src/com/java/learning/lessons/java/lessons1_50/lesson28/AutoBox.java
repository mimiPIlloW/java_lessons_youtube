package com.java.learning.lessons.java.lessons1_50.lesson28;

import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main(String[] args) {
        int a;
        byte b;
        short c;
        long l;
        boolean f;
        char dc;
        float fd;
        double dr;

        Byte bd;
        Short df;
        Integer tg;
        Long fsdv;
        Boolean tr;
        Character kt;
        Float ykl;
        Double hlt;

        List<Integer> list;

      //  int i = new Integer("5");

       // Integer fg = new Integer(5);
       // Integer fj = new Integer("5");
        int fgf = Integer.parseInt("45");
        int fgfr = Integer.valueOf("3");

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(5);
        list1.add(5);
        for (int k : list1) {
            System.out.println(k);
        }


        Object o1 = new Object();
        Object o2 = new Object();
        if (o1 == o2) {
            System.out.println("yes");
        }
        //or
        if (o1.equals(o2)){
            System.out.println("equals");
        }

        Integer g = 5;
        Integer kl = 5;
        if(g.equals(kl)){
            System.out.println("erw");
        }
    }

    Object method() {
        return null;
    }
}

class MyClass{
    public boolean equals(Object obj){
        return (this == obj);
    }
}
