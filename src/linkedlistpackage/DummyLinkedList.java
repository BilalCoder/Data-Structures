package linkedlistpackage;

import java.util.NoSuchElementException;

public class DummyLinkedList {
    private Node head;
    private Node tail;
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if(isEmpty()) {
            head = tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(int value) {
        Node newNode = new Node(value);
        if(isEmpty()) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void print() {
        Node current = head;
        while(current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int indexOf(int value) {
        Node current = head;
        int index = 0;
        while(current != null) {
            if(current.value == value)
                return index;
            index++;
            current = current.next;
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1 ? true : false;
    }

    public void removeFirst() {
        if(isEmpty())
            throw new NoSuchElementException();
        if(head == tail) {
            head = tail = null;
            return;
        }
        Node second = head.next;
        head.next = null;
        head = second;
    }
    public void removeLast() {
        if(head == null)
            throw new NoSuchElementException();
        if(head == tail) {
            head = tail = null;
            return;
        }
        Node current = head;
        while(current.next.next != null) {
            current = current.next;
        }
        tail = current;
        current.next = null;
    }


    private boolean isEmpty() {
        return head == null;
    }

}
