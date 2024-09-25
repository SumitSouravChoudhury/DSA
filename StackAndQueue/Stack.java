package StackAndQueue;

public class Stack<T> {

    Node<T> head;

    Stack() {
        this.head = null;
    }

    boolean isEmpty() {

        return head == null;
    }

    void push(T data) {

        Node<T> new_node = new Node<T>(data);

        new_node.next = head;
        head = new_node;
    }

    void pop() {

        if (isEmpty()) {
            System.out.println("System Underflow");
            return;
        } else {
            Node<T> temp = head;
            head = head.next;
            temp.next = null;
        }
    }

    T peek() {

        if (!isEmpty()) {
            return head.data;
        } else {
            System.out.println("Stack is Empty");
            return head.data;
        }
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);

        System.out.println("Top element is " + st.peek());

        System.out.println("Removing two elements...");
        st.pop();
        st.pop();

        System.out.println("Top element is " + st.peek());
    }
}
