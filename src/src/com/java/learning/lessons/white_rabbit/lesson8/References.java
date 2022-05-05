package com.java.learning.lessons.white.rabbit.lesson8;

import java.util.Locale;

public class References {
    String str = "Моя строка";
    String str2 = new String("Моя строка2"); //ссылки на объект

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
    }

}
