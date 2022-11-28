package DummyArrayQueue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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

    }
}
