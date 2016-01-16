package com.hackerrank.srin_aadc;

import java.util.NoSuchElementException;

/**
 * https://www.hackerearth.com/notes/stacks-and-queues/
 */
public class Queue {
	
	private int[] queue;
	private int front, rear;
	
	public Queue(int capacity) {
		this.queue = new int[capacity];
	}

	public void enqueue(int element) {
		if (rear == queue.length) throw new NoSuchElementException("Queue overflow");
		else {
			queue[rear] = element;// Add the element to the back
			rear++;
		}
	}
	
	public void dequeue() {
		if (isEmpty()) throw new NoSuchElementException("Queue underflow");
		else {
			queue[front] = 0;// Delete the front element
			front++;
		}
	}
	
	public int peek() {
		if (isEmpty()) throw new NoSuchElementException("Queue underflow");
		return queue[front];
	}
	
	public int size() {
		return rear - front;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
}
