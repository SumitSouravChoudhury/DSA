package StackAndQueue;

public class Queue<T> {

    Node<T> front, rear;

    Queue() {
        front = rear = null;
    }

    boolean isEmpty() {
        return front == null && rear == null;
    }

    void enqueue(T data) {
        Node<T> new_node = new Node<>(data);

        if (rear == null) {
            front = rear = new_node;
            return;
        }

        rear.next = new_node;
        rear = new_node;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        Node<T> temp = front;
        front = front.next;
        temp.next = null;

        if (front == null) {
            rear = null;
        }
    }

    T getFront() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return front.data;
    }

    T getRear() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return rear.data;
    }

    public static void main(String[] args) {

        Queue<Integer> q = new Queue<>();

        q.enqueue(10);
        q.enqueue(20);

        System.out.println("Queue Front: " + q.getFront());
        System.out.println("Queue Rear: " + q.getRear());

        q.dequeue();
        q.dequeue();

        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.dequeue();

        System.out.println("Queue Front: " + q.getFront());
        System.out.println("Queue Rear: " + q.getRear());
    }
}