//circular queue:
package stackNqueue;

import stackNqueue.Queue1.que;

public class Queue2 {

    static class circularque {
        public static int arr[];
        public static int size;
        public static int rear = -1;
        public static int front = 0;

        circularque(int size) {
            this.size = size;
            arr = new int[size];
        }

        public static boolean isempty() {
            return rear == -1 && front == -1;
        }

        public static boolean isfull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isfull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;

        }

        // delete

        public static int remove() {
            if (isempty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int res = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return res;

        }

        // display
        public static int peek() {
            if (isempty()) {
                System.out.println("empty");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {

        circularque q = new circularque(10);
        q.add(10);
        q.add(15);
        q.add(25);

        // while (!q.isempty()) {
        // System.out.println(q.peek());
        // q.remove();
        // }
        System.out.println(2 % 7);

    }
}
