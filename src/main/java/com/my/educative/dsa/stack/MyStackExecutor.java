package com.my.educative.dsa.stack;

public class MyStackExecutor {
    public static void main(String[] args) {
        MyStackExecutor myStackExecutor = new MyStackExecutor();
        MyStack<Integer> stack =   myStackExecutor.createStack();
        System.out.println("Stack size is " + stack.max_size);
        System.out.println("Stack top is " + stack.top);
        System.out.println("Stack isempty? " + stack.isEmpty());
        System.out.println("Stack isFull? " + stack.isFull());
        System.out.println("Pop Element " + stack.pop());
        stack.push(7);
        System.out.println("Pop Element " + stack.pop());
    }


    public MyStack<Integer> createStack() {
        MyStack<Integer> myStack =  new MyStack<Integer>(5);
        // myStack.push(1);
        // myStack.push(2);
        // myStack.push(3);
        // myStack.push(4);
        //myStack.push(6);
        return myStack;
    }
}
