package com.java.learning.lessons.white.rabbit.lesson28;

public class Robot<T extends Head> {

    private Body body;
    private T head;

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }

    // Кроме параметризованных классов могут быть параметризованные объекты можно использовать в обычном классе
//    public <T1, T2> T2 foo(int a, int b) {
////        T1 leg = new T1(); // нельзя неизвестно вообще что мы тут создаем
//    }

    public void foo1(Robot<?> ob) { // принимает объект класса, но не знает какой именно
        return;
    }

}
