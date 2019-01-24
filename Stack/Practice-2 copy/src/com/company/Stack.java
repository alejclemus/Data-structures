package com.company;

public class Stack <T> implements StackInterface<T>{

    private int position ;
    private int size;
    private T[] array;

    public Stack(final int size) {
        position = -1;
        this.size = size;
        array = (T[])new Object[size];
    }

    public void push(final T data) {
        if(isStackFull()) {
            T[] array2 = (T[])new Object[size * 2];
            System.arraycopy(array, 0, array2, 0, array.length);
            array = array2;
        }
        array[++ position] = data;
    }

    public T pop() {
        if(position<0){
            System.out.println("Stack Underflow");
            return array[0];
        }
        return array[position --];
    }

    public boolean isStackEmpty() {
        return (position == -1);
    }

    public boolean isStackFull() {
        return (position == size - 1 );
    }

    public void clear() {
        array=null;
    }
}