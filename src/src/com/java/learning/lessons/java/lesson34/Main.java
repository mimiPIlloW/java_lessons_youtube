package com.java.learning.lessons.java.lesson34;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    Object o;

    public static void main(String[] args) {
        //   method();
        //   Date dt = method2();
        //   dt = null;
        System.gc();
        method3();
    }

    private static void method() {
        Date date = new Date();
        System.out.println(date);
    }

    private static Date method2() {
        Date date1 = new Date();
        System.out.println(date1);
        return date1;
    }

    private static void method3() {
        Main main = new Main();
        main = null;

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory b " + runtime.totalMemory());
        System.out.println("Free memory b " + runtime.freeMemory());
        List<Date> dateList = new ArrayList<>(1_000_000_0);
        for (long i = 0; i <= 1_000_000_0; i++) {
            Date date = new Date();
            //date = null;
            dateList.add(date);
        }
        dateList = null;
        System.out.println("Total memory a " + runtime.totalMemory());
        System.out.println("Free memory a " + runtime.freeMemory());
        System.gc();
        System.out.println("Total memory a gc " + runtime.totalMemory());
        System.out.println("Free memory a gc " + runtime.freeMemory());

        Main main1 = new Main();
        main1 = null;
    //    System.gc();
    }

    @Override
    public void finalize(){
        System.out.println("AAAAAAAAAAAAAAAAAAAA");
    }
}
