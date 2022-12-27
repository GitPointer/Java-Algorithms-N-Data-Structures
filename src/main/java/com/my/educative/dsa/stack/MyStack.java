package com.my.educative.dsa.stack;

public class MyStack<T> {
  int top ;
  int max_size;
  T[] arr;  

  public MyStack(int max_size) {
    this.max_size = max_size;
    this.top = -1;
    this.arr = (T[])new Object[max_size];
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == max_size-1;
  }

  public T top() {
    if (isEmpty()) 
     return null;

   return arr[top];  
  }

  public void push(T data) {
    if (isFull())
         throw new RuntimeException("Stack is full");
    arr[++top] = data;
  }

  public T pop() {
    if (isEmpty())
         return null;   
     return arr[top--];    
  }
}
