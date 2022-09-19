package com.java.learning.lessons.java.lesson21;

public class EnumExample {
    enum coffeeSize {
        SMALL,
        MEDIUM,
        BIG
    }

    enum coffeeSize2 {
        SMALL(100),
        MEDIUM(200),
        BIG(300);

        int i;
        coffeeSize2(int i) {
            this.i = i;
        }
        int getI(){
            return i;
        }
    }

    enum coffeeSize3 {
        SMALL,
        MEDIUM,
        BIG{
            String getCoffeeClass(){
                return "B";
            }
        };
        String coffeeClass = "A";

        String getCoffeeClass() {
            return null;
        }
    }




    public static void main(String[] args) {
        coffeeSize coffeeSize = EnumExample.coffeeSize.MEDIUM;
        System.out.println(coffeeSize);
        System.out.println();

        coffeeSize2 coffeeSize2 = EnumExample.coffeeSize2.SMALL;
        System.out.print("Coffee " + coffeeSize2 + " have ");
        System.out.println(coffeeSize2.getI());
        System.out.println();

        coffeeSize3 coffeeSize3 = EnumExample.coffeeSize3.BIG;
        System.out.println(coffeeSize3.getCoffeeClass());
    }
}

class e {
}
