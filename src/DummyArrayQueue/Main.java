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


        System.out.println("======================================================================");
        System.out.println("**********************************************************************");
        System.out.println("======================================================================");


        // Queue implementation using 2 stacks
        DummyQueueUsing2Stacks dummyQueueUsing2Stacks = new DummyQueueUsing2Stacks();
        System.out.println(dummyQueueUsing2Stacks.isEmpty());
        dummyQueueUsing2Stacks.enqueue(1);
        dummyQueueUsing2Stacks.enqueue(2);
        dummyQueueUsing2Stacks.enqueue(3);
        System.out.println(dummyQueueUsing2Stacks.peek());
        System.out.println("Deleted Item - " + dummyQueueUsing2Stacks.dequeue());
        System.out.println("Deleted Item - " + dummyQueueUsing2Stacks.dequeue());
        System.out.println("Deleted Item - " + dummyQueueUsing2Stacks.dequeue());
        dummyQueueUsing2Stacks.enqueue(4);
        dummyQueueUsing2Stacks.enqueue(5);
        System.out.println("Deleted Item - " + dummyQueueUsing2Stacks.dequeue());
        dummyQueueUsing2Stacks.enqueue(6);
        dummyQueueUsing2Stacks.enqueue(7);
        System.out.println(dummyQueueUsing2Stacks.peek());
        dummyQueueUsing2Stacks.enqueue(9);
        dummyQueueUsing2Stacks.enqueue(10);
        System.out.println("Deleted Item - " + dummyQueueUsing2Stacks.dequeue());
        System.out.println("Deleted Item - " + dummyQueueUsing2Stacks.dequeue());
        System.out.println(dummyQueueUsing2Stacks.peek());


        //PriorityQueue using arrays
        DummyPriorityQueueUsingArray dummyPriorityQueueUsingArray = new DummyPriorityQueueUsingArray();
        dummyPriorityQueueUsingArray.add(3);
        dummyPriorityQueueUsingArray.add(5);
        dummyPriorityQueueUsingArray.add(1);
        dummyPriorityQueueUsingArray.add(8);
        dummyPriorityQueueUsingArray.add(2);
        System.out.println(dummyPriorityQueueUsingArray.isFull());
        System.out.println(dummyPriorityQueueUsingArray.remove());
        dummyPriorityQueueUsingArray.add(0);
        System.out.println(dummyPriorityQueueUsingArray.toString());
    }
}
