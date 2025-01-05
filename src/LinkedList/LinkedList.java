package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;


    class Node {
        int value;
        Node next;


        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        newNode = head;
        newNode = tail;
        length = 1;
    }

    Node getHead() {
        return head;
    }

    Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head : null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void printList() {
        Node temp = head;
        if (temp != null) {
            System.out.println("Value: " + temp.value);
            temp = temp.next;
        }
    }

}
