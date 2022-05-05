package com.java.learning.lessons.white.rabbit.lesson26;

// String в JAVA является основнымы носителями текстовой информации поэтому данный класс является наиболее популярным и
// часто используемым. В пакете JAVA lang есть несколько классов для работы со строками это String StringBuilder и StringBuffer
// Данные класс объявлены как final что говорит о том что от данных классов невозможно наследоваться

public class Line {

    public void foo() {

        // Объект можно создать несколькими способами
        // 1) создание с помощью new
        String str = new String("Java");

        // 2) способ для создания объекта это прямое присвоение ссылки литерала заключенного в двойные ковычки
        String str1 = "JaVA";
        str1.charAt(2); // возвращает символ (v)
        System.out.println(str1.codePointAt(1)); // возвращает уникод

        System.out.println(str1.compareTo(str));
        System.out.println(str1.compareToIgnoreCase(str)); // то же самое но не учитывается большая буква или нет

        System.out.println(str1.concat(str)); // объединяет две строки

        System.out.println(str1.equals(str)); // принимает другой объект сравнение содержимого (false or true)
        System.out.println(str1.equalsIgnoreCase(str)); // то же самое но не учитывается большая буква или нет

        System.out.println(str1.hashCode()); // получение hash кода у каждого он свой

        System.out.println(str1.indexOf(65)); // если есть в строке кодировка unicode вывод индекса 3 (A под индекс 3) если нет -1

        System.out.println(str1.isEmpty()); // вывод true если строка пустая если нет то false

        System.out.println(str1.length()); // возвращает длину строки (пробелы считаются тоже)

        String str2 = "Hot JavaHello";
        String[] strings = str2.split(" ");
        for (String element : strings) {
            System.out.println(element);// разделение на массивы так как там и там пробел он делит
        }

        System.out.println(str2.substring(2, 8)); // вырезает от и до

        char[] charArray = str1.toCharArray();
        for (char element : charArray) {
            System.out.println(element);  // каждый символ делает массив с новой строки выводим
        }

        System.out.println(str2.toLowerCase()); // в маленькие буквы
        System.out.println(str2.toUpperCase()); // в большие буквы

        System.out.println(str2.trim()); // обрезает пробелы в начале или в конце строки

        // 3) статические методы непосредственно самого класса
        String str3 = String.valueOf(65); // 65 уже не число а строка
        System.out.println(String.valueOf(65));

        // String.copyValueOf(); // принимает массив char и преобразует их в строку

    }
}
