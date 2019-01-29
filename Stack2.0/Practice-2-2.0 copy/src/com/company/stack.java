package com.company;

public class stack {
    private  int[] stack;
    private int pointer;

    public int getValue() {
        return this.stack[pointer];
    }

    public int getPointer(){
        return this.pointer;
    }

    public void stackarr()
    {
        stack=new int[10];
        pointer=-1;
    }

    public void push(int num)
    {
        if(pointer== stack.length-1)
        {
            int[] biggerArray= new int[stack.length+10];
            System.arraycopy(stack,0,biggerArray,0,stack.length);
            stack=biggerArray;
            stack[++pointer] = num;
        }
        else
        {
            stack[++pointer] = num;
        }
    }

    public int pop()
    {
        if(pointer==-1)
        {
            throw new IllegalArgumentException("The stack is empty");
        }
        return stack[pointer--];
    }

    public void clear() {
        int[] tempArray = new int[stack.length];
        stack = tempArray;
        pointer = -1;
    }
}
