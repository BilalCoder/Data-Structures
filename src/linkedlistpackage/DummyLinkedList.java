package linkedlistpackage;

import java.util.NoSuchElementException;

public class DummyLinkedList {
    private Node head;
    private Node tail;
    private int size;
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
        size++;
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
        size++;
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
            size--;
            return;
        }
        Node second = head.next;
        head.next = null;
        head = second;
        size--;
    }
    public void removeLast() {
        if(head == null)
            throw new NoSuchElementException();
        if(head == tail) {
            head = tail = null;
            size--;
            return;
        }
        Node current = head;
        while(current.next.next != null) {
            current = current.next;
        }
        tail = current;
        current.next = null;
        size--;
    }

    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public int[] toArray(){
        int[] arr = new int[size];
        Node current = head;
        int index = 0;
        while (current != null){
            arr[index++] = current.value;
            current = current.next;
        }
        return arr;
    }

    public void reverse() {
        Node prevNode = head;
        Node currentNode = head.next;
        Node nextNode;
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
//        Node temp = head;
//        head = tail;
//        tail = temp;
//        temp.next = null;
        // A better logic
        tail = head;
        head = prevNode;
        tail.next = null;
    }

    public int getKthNodeFromEnd(int k) {
        if (isEmpty())
            throw new IllegalStateException();
        if(k < 1 || k > size)
            throw new IllegalArgumentException();
        Node first = head;
        Node second = head;
        for (int i=0; i<k; i++) {
            second = second.next;
        }
        while (second != null) {
            second = second.next;
            first = first.next;
        }
        return first.value;
    }


}
