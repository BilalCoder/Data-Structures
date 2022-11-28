package DummyArrayQueue;

import java.util.Arrays;

public class DummyCircularArrayQueue {
    int[] queue;

    public DummyCircularArrayQueue(int size) {
        queue = new int[size];
    }
    int front = 0;
    int rear = 0;
    int count = 0;
    public boolean isEmpty() {
        return count == 0;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");
        return queue[front];
    }

    public void enqueue(int value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        queue[rear] = value;
        rear = (rear + 1) % queue.length;
        count++;
    }

    public int deque() {
        if(isEmpty())
            throw new IllegalArgumentException("Queue is empty");
        int item = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        count--;
        return item;
    }

    public boolean isFull() {
        return count == queue.length;
    }

    public String toString() {
        return Arrays.toString(queue);
    }
}
