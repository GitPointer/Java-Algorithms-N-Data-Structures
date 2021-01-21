package com.my.ds.algo.madeineasy.by_ns.ch02.problem1;

/*
 * This class implement the basic function of stack.Additionaly for Tower of Hanoi problem it also maintain the 
 * ascending order of size, the smallest at the top.
 */
public class TOHStack {

	private int stackSize;
	private int top;// This will help to keep the track of size of stack.
	private int[] stackArray;

	public TOHStack(int size) {
		this.stackSize = size;
		this.top = -1;
		this.stackArray = new int[size];
	}

	public void push(int entry) throws Exception {
		if (this.isStackFull()) {
			System.out.println(("Stack is full. Increasing the capacity."));
			this.increaseStackCapacity();

		} else if (top != -1 && entry > peek()) {
			throw new Exception("new Entry should be less than the previous Entry : " + peek());
		}
		this.stackArray[++top] = entry;

	}

	public int pop() throws Exception {
		if (this.isStackEmpty()) {
			throw new Exception("Stack is empty. Can not remove element.");
		}
		int entry = this.stackArray[top--];
		return entry;

	}

	/**
	 * This method returns top of the stack without removing it.
	 * 
	 * @return
	 */
	public long peek() {
		return stackArray[top];
	}

	private void increaseStackCapacity() {
		int[] newStack = new int[this.stackSize * 2];
		for (int i = 0; i < stackSize; i++) {
			newStack[i] = this.stackArray[i];
		}
		this.stackArray = newStack;
		this.stackSize = this.stackSize * 2;

	}

	/**
	 * This method returns true if the stack is empty
	 * 
	 * @return
	 */
	public boolean isStackEmpty() {
		return (top == -1);
	}

	/**
	 * This method returns true if the stack is full
	 * 
	 * @return
	 */
	public boolean isStackFull() {
		return (top == stackSize - 1);

	}

	public static void main(String[] args) {
		TOHStack stack = new TOHStack(2);
		for (int i = 10; i > 1; i--) {
			try {
				stack.push(i);
			} catch (Exception e) {
				System.out.println("Exception-1 :" + e.getMessage());
			}
		}
		try {
			stack.push(9);
		} catch (Exception e) {
			System.out.println("Exception-2 :" + e.getMessage());
		}
		for (int i = 1; i < 10; i++) {
			try {
				System.out.println("Pop :" + stack.pop());
			} catch (Exception e) {
				System.out.println("Exception-3 :" + e.getMessage());

			}
		}
		try {
			stack.push(9);
		} catch (Exception e) {
			System.out.println("Exception-2 :" + e.getMessage());
		}
	}

}
