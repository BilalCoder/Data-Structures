import linkedlistpackage.DummyLinkedList;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

//        // Validating arrays
//        DummyArray numbers = new DummyArray(3);
//        numbers.insert(10);
//        numbers.insert(20);
//        numbers.insert(30);
//        System.out.println(numbers.indexOf(30));
//        numbers.print();
//        numbers.insert(40);
//        numbers.print();
//        numbers.removeAt(2);
//        numbers.print();
//        numbers.removeAt(0);
//        numbers.print();


        // Validating LinkedLists
        DummyLinkedList linkedList = new DummyLinkedList();
        System.out.println(linkedList.indexOf(4));
        linkedList.removeLast();
        linkedList.print();
        //linkedList.removeFirst(); // custom exception
        linkedList.print();
        linkedList.addFirst(1);
        linkedList.removeFirst();
        linkedList.print();
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.print();
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.print();
        linkedList.addFirst(7);
        linkedList.addFirst(8);
        linkedList.addFirst(9);
        linkedList.print();
//        System.out.println(linkedList.indexOf(4));
//        System.out.println(linkedList.indexOf(10));
//        System.out.println(linkedList.indexOf('a'));
//        System.out.println(linkedList.contains(10));
//        System.out.println(linkedList.contains(1));
//        System.out.println(linkedList.contains(8));
        linkedList.removeFirst();
        linkedList.print();
        linkedList.removeLast();
        linkedList.print();
    }
}
