package com.my.educative.dsa.queue;

public class MyQueue<T> {
    int front;
    int back;
    T[] arr;
    int max_size;
    int curr_size;

    public MyQueue(int max_size) {
        this.max_size = max_size;
        this.front = 0;
        this.back = 0;
        this.arr = (T[]) new Object[max_size];
        this.curr_size = 0;
    }

    public boolean isEmpty() {
        return curr_size == 0;
    }

    public boolean isFull() {
        return curr_size == max_size;
    }
    
    public T top() {
        if (isEmpty())
          return null;   
        return arr[front];  
    }


    public void enqueue(T data) {
        if (isFull()){
            throw new RuntimeException("Queue is already full");

        }
        arr[back] = data;
        back = (back + 1) % max_size;
        curr_size++;
    }

    public T dequeue() {
        if (isEmpty())
           return null;
           
        T temp = arr[front];
        front = (front + 1) % max_size;
        curr_size -- ;
        return temp;
    }

}
