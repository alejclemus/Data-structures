package com.company;

import org.junit.Assert;

public class stackTest {
    stack stackito=new stack();


    @org.junit.Test
    public void push() {
        stackito.stackarr();
        stackito.push(1);
        stackito.push(2);
        stackito.push(3);
        stackito.push(4);
        stackito.push(5);
        stackito.push(6);
        stackito.push(7);
        stackito.push(8);
        stackito.push(9);
        stackito.push(10);
        stackito.push(11);
        stackito.push(12);
        Assert.assertEquals(12,stackito.getValue());
        Assert.assertEquals(11,stackito.getPointer());
    }

    @org.junit.Test
    public void pop() {
        stackito.stackarr();
        stackito.push(1);
        stackito.push(2);
        stackito.push(3);
        stackito.pop();
        Assert.assertEquals(2,stackito.getValue());
    }

    @org.junit.Test
    public void clear() {
        stackito.stackarr();
        stackito.push(1);
        stackito.push(2);
        stackito.push(3);
        stackito.push(4);
        stackito.push(5);
        stackito.push(6);
        stackito.push(7);
        stackito.push(8);
        stackito.push(9);
        stackito.push(10);
        stackito.clear();
        Assert.assertEquals(-1,stackito.getPointer()); //llenar y vaciar lista pointer/head=-1;
        stackito.push(9);
        Assert.assertEquals(9,stackito.getValue());
    }

}