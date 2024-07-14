package linkedlist;

public class LinkedList {
    Node head;
    private int size;

    LinkedList() {
        this.size = 0;

    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add -first/last
    public void addfirst(String data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = newnNode;
            return;

        }

        newnNode.next = head;
        head = newnNode;
    }

    public void addlast(String data) {
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

    // delete first
    public void deletefirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;

    }

    // delete last

    public void deletelast() {
        if (head == null) {
            head = null;
            return;
        }
        size--;
        if (head.next == null) {
            System.out.println();
        }
        Node secondlastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlastNode = secondlastNode.next;
        }
        secondlastNode.next = null;

    }

    public void printlinkedlist() {
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;

        }
        System.out.println("null");

    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addfirst("1");
        list.addfirst("2");
        list.printlinkedlist();
        list.deletefirst();
        list.printlinkedlist();
        System.out.println(list.size());

    }
}
