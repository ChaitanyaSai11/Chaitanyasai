package linkedlist;

import java.util.*;

public class reverseLLrec {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addtolist(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // reverse iterative
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }

    // reverse recursion
    public Node reverseLLrecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseLLrecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }

    public void printLL() {
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println("Null");

    }

    public static void main(String[] args) {
        reverseLLrec list = new reverseLLrec();
        list.addtolist(1);
        list.addtolist(2);
        list.addtolist(3);
        list.head = list.reverseLLrecursive(list.head);
        list.printLL();

    }

}
