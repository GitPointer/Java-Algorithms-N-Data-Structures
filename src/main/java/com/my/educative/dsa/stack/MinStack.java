package com.my.educative.dsa.stack;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;


    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int data) {
        mainStack.push(data);
        if (minStack.isEmpty()) {
            minStack.push(data);
        } else {
            if(data < minStack.peek()) {
                minStack.push(data);
            } else {
                minStack.push(minStack.peek());   
            }
        }
        
    }

    public int pop() {
      minStack.pop();
      return mainStack.pop();
    }

    public int getMin() {
        return minStack.peek();
    }

    

    
}
