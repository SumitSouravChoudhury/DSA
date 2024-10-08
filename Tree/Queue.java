public class Queue<T> {
    
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size==0;
    }

    T front() {
        if(front == null) {
            return null;
        }
        return front.data;
    }

    void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if(rear == null) {
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    T dequeue() {

        if(front == null) {
            return null;
        }

        T temp = front.data;
        front = front.next;
        if(front == null) {
            rear = null;
        }
        size--;
        return temp;
    }
}
