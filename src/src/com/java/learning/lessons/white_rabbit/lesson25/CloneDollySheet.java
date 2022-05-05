package com.java.learning.lessons.white.rabbit.lesson25;

public class CloneDollySheet {

    public static DollySheet foo(DollySheet dollySheet2) {

        DollySheet sheet = null;
        try {
            sheet = (DollySheet) dollySheet2.clone(); // присвоили конкретный объект который мы клонируем
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheet;
    }
}
