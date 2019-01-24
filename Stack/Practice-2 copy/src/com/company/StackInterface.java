package com.company;

public interface StackInterface<T> {
    public void push(final T data);
    public T pop();
    public boolean isStackEmpty();
    public boolean isStackFull();
    public void clear();
}

