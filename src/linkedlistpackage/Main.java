package linkedlistpackage;

public class Main {
    public static void main(String[] args) {
        DummyLinkedList linkedList = new DummyLinkedList();
        System.out.println(linkedList.indexOf(4));
        //linkedList.removeLast();
        linkedList.print();
        //linkedList.removeFirst(); // custom exception
        linkedList.print();
        System.out.println(linkedList.size());
        linkedList.addFirst(1);
        System.out.println(linkedList.size());
        linkedList.removeFirst();
        linkedList.print();
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        System.out.println(linkedList.size());
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
        // To Convert list to array;
//        int[] arr = linkedList.toArray();
//        System.out.println(Arrays.toString(arr));
        linkedList.reverse();
        linkedList.print();
        System.out.println(linkedList.getKthNodeFromEnd(6));
        System.out.println(linkedList.getKthNodeFromEnd(1));
        System.out.println(linkedList.getKthNodeFromEnd(3));
        System.out.println(linkedList.getKthNodeFromEnd(4));

    }
}
