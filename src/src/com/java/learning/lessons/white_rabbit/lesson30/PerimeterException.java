package com.java.learning.lessons.white.rabbit.lesson30;

public class PerimeterException extends Exception {

    public PerimeterException() { // либо пустой
    }

    public PerimeterException(String message) { // Либо принимать сообщение которое мы хотим передать пользователю
        super(message);
    }

    public PerimeterException(String message, Throwable cause) { // Сообщение с причиной
        super(message, cause);
    }

    public PerimeterException(Throwable cause) { // Просто причина
        super(cause);
    }

    //
    public PerimeterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
