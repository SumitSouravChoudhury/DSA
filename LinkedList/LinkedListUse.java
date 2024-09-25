import java.util.Scanner;

public class LinkedListUse {

    public static Node<Integer> takeInput() {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int data = s.nextInt();
        Node<Integer> head = null, tail = null;

        while (data != -1) {

            Node<Integer> currentNode = new Node<>(data);

            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = currentNode;
            }

            data = s.nextInt();
        }

        return head;
    }

    public static Node<Integer> insert(Node<Integer> head, int ele, int pos) {

        Node<Integer> nodeInserted = new Node<>(ele);

        if (pos == 0) {

            nodeInserted.next = head;
            return nodeInserted;
        } else {

            Node<Integer> prev = head;
            int count = 0;

            while (count < pos - 1 && prev != null) {
                count++;
                prev = prev.next;
            }

            nodeInserted.next = prev.next;
            prev.next = nodeInserted;
        }

        return head;
    }

    public static Node<Integer> delete(Node<Integer> head, int pos) {

        if (pos == 0) {
            head = head.next;
            return head;
        }

        Node<Integer> prev = head;
        int count = 0;

        while (count < pos - 1 && prev != null) {
            count++;
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return head;
    }

    public static Node<Integer> reverse(Node<Integer> head) {

        Node<Integer> curr = head, prev = null, next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static Node<Integer> midpoint(Node<Integer> head) {

        Node<Integer> slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {

        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        Node<Integer> t1 = head1, t2 = head2, head = null, tail = null;

        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while (t1 != null && t2 != null) {

            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }

        if (t1 != null) {
            tail.next = t1;
        } else {
            tail.next = t2;
        }

        return head;
    }

    public static Node<Integer> createLinkedList() {

        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1;
    }

    public static void print(Node<Integer> head) {

        Node<Integer> temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void increment(Node<Integer> head) {

        Node<Integer> temp = head;

        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }
    }

    public static int length(Node<Integer> head) {

        Node<Integer> temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static int printIth(Node<Integer> head, int index) {

        Node<Integer> temp = head;
        int count = 0;

        while (count < index && temp != null) {
            count++;
            temp = temp.next;
        }

        return temp.data;
    }

    public static void main(String[] args) {

        Node<Integer> head = takeInput();
        print(head);
        // head = insert(head, 90, 4);
        // print(head);
        // head = delete(head, 0);
        // print(head);
        head = reverse(head);
        print(head);
        // Node<Integer> mid = midpoint(head);
        // System.out.println(mid.data);
        // increment(head);
        // print(head);
        // int size = length(head);
        // System.out.println(size);
        // System.out.println(printIth(head, 2));
    }
}
