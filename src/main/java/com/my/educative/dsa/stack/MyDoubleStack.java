package com.my.educative.dsa.stack;

public class MyDoubleStack<V> {
    int top1;
    int top2;
    int max_size;
    V[] arr;

    public MyDoubleStack(int size) {
     top1 = -1;
     top2= size;
     max_size = size;
     arr = (V[]) new Object[size];
    }
    
    public Boolean isEmpty1() {
       return top1 == -1;
    }

    public Boolean isEmpty2() {
        return top2 == max_size;
    }

    public Boolean isFull() {
        return top2 - top1 == 1;
    }

    public void push1(V data) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }

        arr[++top1] = data;
    }


    public void push2(V data) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        arr[--top2] = data;
    }

    public V pop1() {
        if (isEmpty1()) {
            return null;
        }
        return arr[top1--];
    }

    public V pop2() {
        if (isEmpty2()) {
            return null;
        }
        return arr[top2++];
    }


}
