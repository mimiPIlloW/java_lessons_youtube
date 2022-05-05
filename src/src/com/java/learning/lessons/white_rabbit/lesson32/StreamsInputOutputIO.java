package com.java.learning.lessons.white.rabbit.lesson32;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StreamsInputOutputIO {

    private int a = 0;

    public void foo() {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("E:/1.txt"); // байтовый поток
            while ((a = fis.read()) != -1) {
                System.out.print((char) a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void foo1() {

        FileInputStream fis = null;
        InputStreamReader isr = null;

        try {
            fis = new FileInputStream("E:/1.txt"); // байтовый поток
            isr = new InputStreamReader(fis, "UTF-8"); // Символьный поток
            while ((a = isr.read()) != -1) {
                System.out.print((char) a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally { // обязательно нужно закрывать потоки
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // ЗАПИСЬ КАКОЙ ТО ИНФОРМАЦИИ НА ФАЙЛ

    public void foo2() {

        FileOutputStream fos = null;
        FileWriter fw = null;

        final boolean record = true;

        String str = "HOT ЖАРКО";
        String str1 = " ДАЖЕ VERY";

        try {
            fos = new FileOutputStream("E:/2.txt"); // записываем информацию стирая прошлое
            fos.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fw = new FileWriter("E:/2.txt", record); // добавляем информацию
            fw.write(str1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void foo3(){

        FileOutputStream fos = null;
        FileWriter fw = null;
        File file = new File("E:/3.txt"); // используется для работы с файлами и каталогами на внешних носителей
        //создать удалить и тд

        final boolean record = true;

        String str = "HOT ";
        String str1 = " JAVA";

        try {
            fos = new FileOutputStream(file); // записываем информацию стирая прошлое
            fos.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fw = new FileWriter(file, record); // добавляем информацию
            fw.write(str1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
