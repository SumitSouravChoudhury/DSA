package StackAndQueue;

public class Stack {
    
    private int[] arr;
    private int capacity;
    private int top;

    Stack(int size) {

        arr = new int[size];
        capacity = size;
        top = -1;
    }

    void push(int element) {
        if(isFull()) {
            System.out.println("Stack Overflow");
        }
        else {
            arr[++top] = element;
        }
    }

    int pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    boolean isFull() {
        
        return (top == capacity-1);
    }

    boolean isEmpty() {
        
        return (top == -1);
    }

    int peek() {
        return arr[top];
    }

    int getSize() {
        return top+1;
    }

    void printStack() {

        for(int i=0; i<=top; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        stack.printStack();
    }
}
