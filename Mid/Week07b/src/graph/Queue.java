package graph;
//import Exceptions.*;

public class Queue {
	private int front;
	private int back;
	private Object[] data;
	private final static int MAX = 100;

	Queue() {
		data = new Object[MAX];
		front = back = 0;
	}

	public int size() {
		if (back >= front)
 			return (back - front);
		else
 			return (MAX + back - front);
	}

	public boolean isEmpty() {
		return (front == back);
	}
    
	public void enqueue(Object x) {
		back = (back + 1) % MAX;
		if (back == front) {
			// Exception; 
		}
		data[back] = x;
	}

	public Object dequeue() {
// throws Underflow {
//		if(isEmpty()) throw new Underflow("Queue Dequeue");
		front = (front + 1) % MAX;
		return data[front];
	}

	public Object front() {
// throws Underflow {
//		if(isEmpty()) throw new Underflow("Queue front");
		return data[(front+1)%MAX];
	}
} // end Queue class
