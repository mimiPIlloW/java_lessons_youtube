package com.java.learning.lessons.white_rabbit.lesson8;

public class References {
    public String str = "Моя строка";
    public String str2 = new String("Моя строка2"); //ссылки на объект

    // ссылочные типы данных, классы,
    Byte a;
    Short b;
    Integer c;
    Long d;
    Character e;
    Float f;
    Double g;
    Boolean h;

    public void foo() {
        new String("Моя строка3");
        System.out.println(str);
        System.out.println(str2);
        System.out.println(new String("Моя строка3"));
    }
}
