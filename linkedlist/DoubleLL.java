package linkedlist;

public class DoubleLL {

    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertfirst(int data) {
        Node newnode = new Node(data);
        // head null kakapothe

        if (head != null) {
            head.prev = newnode;
        }

        // head null ayithe
        newnode.next = head;
        newnode.prev = null;
        head = newnode;

    }

    public void printLL() {
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println("Start");
    }

    public static void main(String[] args) {

        DoubleLL list = new DoubleLL();
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);
        list.printLL();
    }

}
