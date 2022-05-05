package com.java.learning.lessons.white.rabbit.lesson27;

// Основные различия stringBuilder работает быстрее, но он не является потоко безопаснее

public class LineBuilderAndBuffer {

    public void foo() {
        String str = new String();
        StringBuilder stringBuilder = new StringBuilder("Java");
        System.out.println(stringBuilder.append("Hot"));  // складывает две строки в один объект
        // очень часто используется для сложения строк
        System.out.println(stringBuilder.insert(1, "G"));  // вставляет после индекса, что укажем

        stringBuilder.deleteCharAt(1);  // удаления символа их нашей строки
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.reverse());  // Строка задом наперед (avaGJ) новый объект не создается
        // будет храниться (avaGJ)
    }
}
