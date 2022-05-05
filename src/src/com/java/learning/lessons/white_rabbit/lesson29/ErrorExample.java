package com.java.learning.lessons.white.rabbit.lesson29;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorExample {

    private ABC abc;

    public void foo() {
//        System.out.println(1/0); ошибка
//        int array[] = {1, 2, 3}; ошибка
//        array[5] = 3;

        // обработка
//        try { // выражения, которые могут содержать ошибку
//            abc.show();
//        } catch (NullPointerException e){ // Ловит ошибку
//            e.printStackTrace();
//            System.out.println("Ошибка");
//        }
//    }
        // Обрабатывать ошибки такого типа try catch глупо тк намного проще
//        if(abc == null){
//            System.out.println("Null pointer");
//        } else {
//            abc.show();
//        }
        // Простые ошибки лучше с if else

        // Что делать и как лучше поступить если у нас несколько ошибок
        // Когда два catch то после нахождения ошибки чаще всего при нахождении одной ошибки 2 показывать не будут
        try { // выражения, которые могут содержать ошибку
            abc.show();
            System.out.println(1 / 0);
        } catch (NullPointerException e) { // Ловит ошибку
            e.printStackTrace();
            System.out.println("Ошибка");
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.out.println("2 ошибка ");
        }
        // можно объединять catch (NullPointerException | ArithmeticException e)
    }

    public void foo1() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("");
    }

    public void foo2() {
        FileInputStream fileInputStream = null; // выносим поток
        try {
            fileInputStream = new FileInputStream(""); // Создаем поток
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close(); // закрываем
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
