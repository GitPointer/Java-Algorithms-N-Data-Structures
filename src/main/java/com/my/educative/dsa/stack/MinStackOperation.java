package com.my.educative.dsa.stack;

public class MinStackOperation {
    public static void main(String[] args) {
        MinStackOperation minStackOperation = new MinStackOperation();
        minStackOperation.doOperation();       
    }


    public void doOperation() {
        MinStack minStack = new MinStack();
        minStack.push(9);
        minStack.push(3);
        minStack.push(1);
        minStack.push(4);
        minStack.push(2);
        minStack.push(5);


        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();

        System.out.println("The min stack value is  " + minStack.getMin());
    }
}
