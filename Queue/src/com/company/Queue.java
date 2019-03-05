package com.company;

class Queue {
    int front, rear, size;
    int  capacity;
    Worker array[];

    Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
    }

    boolean isFull(Queue queue)
    {  return (queue.size == queue.capacity);
    }

    boolean isEmpty(Queue queue)
    {  return (queue.size == 0); }

    void add(Worker newWorker)
    {
        if (isFull(this))
            return;
        this.rear = (this.rear + 1)%this.capacity;
        this.array[this.rear] = newWorker;
        this.size = this.size + 1;
    }

    void delete(int capacity)
    {
        for (int i=0; i<array.length;i++){
            System.out.print("Name: "+array[i].name+" Social security number: "+array[i].socialSecurityNumber+" Total days worked"+array[i].daysWorked);
        }

    }
}
