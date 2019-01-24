package com.company;

public class StackTest {
    Stack<Integer> stacktest = new Stack<Integer>(7);

    @org.junit.Test
    public void push() {
        stacktest.push(23);
        stacktest.push(89);
        stacktest.push(59);
        stacktest.push(90);
        stacktest.push(20);
        stacktest.push(19);
    }

    @org.junit.Test
    public void pop() {
        stacktest.pop();
    }


    @org.junit.Test
    public void clear() {
        stacktest.clear();
    }
}