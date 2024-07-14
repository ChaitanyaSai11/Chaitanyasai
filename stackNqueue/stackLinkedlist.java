package stackNqueue;

public class stackLinkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }

        public static int pop() {
            int top = head.data;
            if (isEmpty()) {
                return -1;
            }
            head = head.next;
            return top;
        }

        public static int peek() {
            int top = head.data;
            if (isEmpty()) {
                return -1;
            }
            return top;
        }

    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }

    }

}
