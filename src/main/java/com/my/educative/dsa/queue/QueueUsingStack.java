package com.my.educative.dsa.queue;
import java.util.Stack;

public class QueueUsingStack<T> {
    
    Stack<T> stack = new Stack<T>();
    
    public void enQueue(T data) {
      stack.push(data);
    }


    public T deQueue() {
        if (stack.empty()){
            return null;
        }
        Stack<T> tempStack = new Stack<T>();
        while(!stack.empty()){
            tempStack.push(stack.pop());
        }

        T result = tempStack.pop();

        while(!tempStack.empty()){
            stack.push(tempStack.pop());
        }
        return result;
    }

    public Boolean isEmpty() {
        return stack.empty();
    }


    public static void main(String[] args) {
        QueueUsingStack<Integer> queue = new QueueUsingStack<Integer>();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

     System.out.println(queue.deQueue());
     while(!queue.isEmpty()) {
      System.out.println("Inside While loop:");  
      System.out.println(queue.deQueue());
    }

    System.out.println(queue.isEmpty());
        
    }


}
