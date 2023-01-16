package com.my.educative.dsa.stack;
import java.util.Stack;

public class SortStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> tempStack = new Stack<Integer>();
    public static void main(String[] args) {
        SortStack sortStack = new SortStack();
        sortStack.enqueueStack();
        sortStack.sort();
        sortStack.printStack();
        
    }

    public void enqueueStack() {
        stack.push(2);
        stack.push(97);
        stack.push(4);
        stack.push(42);
        stack.push(12);
        stack.push(60);
        stack.push(23);
    }

    public void sort(){
       while (!stack.isEmpty()) {
           int value = stack.pop();
           if (!tempStack.isEmpty() && value >= tempStack.peek()) {
               tempStack.push(value);
           } else {
               while(!tempStack.isEmpty() && tempStack.peek() > value){
                   stack.push(tempStack.pop());
               }
               tempStack.push(value); 
           }
       }

       while(!tempStack.isEmpty()) {
         stack.push(tempStack.pop());
       }
    }

    private void printStack() {
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
