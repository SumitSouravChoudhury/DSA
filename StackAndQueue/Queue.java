package StackAndQueue;

public class Queue<T> {
    
    T[] arr;
    int front, rear;
    int capacity;

    Queue(int size) {

        arr = new T[size];
        front = -1;
        rear = -1;
        capacity = size-1;
    }

    void enqueue(T element) {

        if(isFull()) {
            System.out.print("Queue Overflow");
        }
        else {
            if(front == -1) {
                front = 0;
            }

            arr[++rear] = element;
        }
    }

    int dequeue() {

        int element;
        if(isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        else {

            element = arr[front];

            if(front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
        }
        return element;
    }

    boolean isFull() {
        if(front == 0 && rear == capacity) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if(front == -1) {
            return true;
        }
        return false;
    }

    void printQueue() {
        for(int i=front; i<=rear; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.printQueue();
        System.out.println();
        queue.dequeue();
        queue.printQueue();

    }
}