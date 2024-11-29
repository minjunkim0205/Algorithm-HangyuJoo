package wgraph;

class Node {
    Object data;
    Node link;
}

class LinkedQueue {

    private Node front;
    private Node rear;
    private int count;

    public LinkedQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public void enqueue(Object x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.link = null;
        if (count == 0) {
            front = rear = newNode;
        } else {
            rear.link = newNode;
            rear = newNode;
        }
        count++;
    } // end enqueue()

    public Object dequeue() {
        if (count == 0)
            return null;
        Object item = front.data;
        front = front.link;
        if (front == null) {
            rear = null;
        }
        count--;
        return item;
    } // end dequeue()

    public void remove() {
        if (count != 0) {
            front = front.link;
            count--;
        }
    } // end remove()

    public Object peek() {
        if (count == 0)
            return null;
        else
            return front.data;
    } // end peek()

} // end ArrayQueue class
