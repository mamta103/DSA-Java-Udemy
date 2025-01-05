package LinkedList;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    class Node {
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }
    }


    public void getHead() {
        System.out.println("Head: "+head.value);
    }

    public void getTail() {
        System.out.println("Tail: "+tail.value);
    }


    public void  getLength() {
        System.out.println("Length: "+length); ;
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head Null");
            System.out.println("Tail Null:");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        if (length == 0) {
            System.out.println("Empty");
        } else {
            printList();
        }
    }

    private void printList() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}
