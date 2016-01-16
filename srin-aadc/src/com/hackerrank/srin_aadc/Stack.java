package com.hackerrank.srin_aadc;

import java.util.NoSuchElementException;

/**
 * https://www.hackerearth.com/notes/stacks-and-queues/
 */
public class Stack {
	
	private int top = -1;//globally defining the value of top ,as the stack is empty.
	private int[] stack;
	
	public Stack(int capacity) {
		this.stack = new int[capacity];
	}
	
	public void push(int x) {
		if (top == stack.length-1) throw new NoSuchElementException("Stack overflow");
		else {
			top = top + 1;//incrementing top position
			stack[top] = x;//inserting element on incremented position.
		}
	}
	
	public void pop() {
		if (isEmpty()) throw new NoSuchElementException("Stack underflow");
		else {
			top = top - 1;//decrementing top’s position will detach last element from stack.
		}
	}
	
	public int peek() {
		if (isEmpty()) throw new NoSuchElementException("Stack underflow");
		return stack[top];
	}
	
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int size() {
		return top + 1;
	}
}
