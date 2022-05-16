package com.java.learning.lessons.white_rabbit.lesson11;

public class OperatorSwitch {
    static public final int VALUE = 2, FIRST_VALUE = 1, SECOND_VALUE = 2, THIRD_VALUE = 3;

    static public void foo() {
        switch (40) {
            case 25:
                System.out.println(25);
            case 73: // если поставить 40 то выполнится все от этого case поэтому нужно ставить break;
                System.out.println(73);
            case 40:
                System.out.println(40);
        }
    }

    static public void foo1() {
        switch (VALUE) {
            case FIRST_VALUE:
                System.out.println(FIRST_VALUE);
                break;
            case SECOND_VALUE:
                System.out.println(SECOND_VALUE);
                break;
            case THIRD_VALUE:
                System.out.println(THIRD_VALUE);
                break;
            default:
                System.out.println("Default");
        }
    }

    public static void main(String[] args) {
        foo();
        System.out.println();
        foo1();
    }
}

