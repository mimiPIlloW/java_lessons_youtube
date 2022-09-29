package com.java.learning.lessons.java.lessons1_50.lesson15;

interface ISomeInterface extends IOtherInterface {
    int SOME_VARIABLE = 5;

    void sumTwoNumber(int one, int two);

}

interface IOtherInterface {
    void someMethod();
}
