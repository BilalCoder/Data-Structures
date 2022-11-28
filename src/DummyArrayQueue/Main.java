package DummyArrayQueue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Simple Array queue
        DummyArrayQueue dummyArrayQueue = new DummyArrayQueue();
        System.out.println(dummyArrayQueue.isEmpty());
        //System.out.println(dummyArrayQueue.peek());
        dummyArrayQueue.enqueue(1);
        dummyArrayQueue.enqueue(3);
        dummyArrayQueue.enqueue(5);
        System.out.println(dummyArrayQueue);
        System.out.println(dummyArrayQueue.deque());
        System.out.println(dummyArrayQueue);
        System.out.println(dummyArrayQueue.peek());
        System.out.println(dummyArrayQueue.isEmpty());
        System.out.println(dummyArrayQueue.isFull());

        dummyArrayQueue.enqueue(6);
        dummyArrayQueue.enqueue(7);
        //dummyArrayQueue.enqueue(8);
        System.out.println(dummyArrayQueue);

        System.out.println("======================================================================");
        System.out.println("**********************************************************************");
        System.out.println("======================================================================");


        //Circular Array queue
        DummyCircularArrayQueue dummyCircularArrayQueue = new DummyCircularArrayQueue(5);
        System.out.println(dummyCircularArrayQueue.isEmpty());
        //System.out.println(dummyCircularArrayQueue.peek());
        dummyCircularArrayQueue.enqueue(1);
        dummyCircularArrayQueue.enqueue(3);
        dummyCircularArrayQueue.enqueue(5);
        System.out.println(dummyCircularArrayQueue);
        System.out.println(dummyCircularArrayQueue.deque());
        System.out.println(dummyCircularArrayQueue);
        System.out.println(dummyCircularArrayQueue.peek());
        System.out.println(dummyCircularArrayQueue.isEmpty());
        System.out.println(dummyCircularArrayQueue.isFull());
        System.out.println(dummyCircularArrayQueue.deque());

        dummyCircularArrayQueue.enqueue(6);
        dummyCircularArrayQueue.enqueue(7);
        dummyCircularArrayQueue.enqueue(8);
        dummyCircularArrayQueue.enqueue(9);
        System.out.println(dummyCircularArrayQueue.deque());
        dummyCircularArrayQueue.enqueue(10);
        System.out.println("Front - " + dummyCircularArrayQueue.peek());
        System.out.println(dummyCircularArrayQueue);

    }
}
