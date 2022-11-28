package DummyArrayQueue;

import java.util.Arrays;

public class DummyArrayQueue {
    int[] queue = new int[5];
    int front = 0;
    int rear = 0;
    public boolean isEmpty() {
        return front == rear;
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
        queue[rear++] = value;
    }

    public int deque() {
        if(isEmpty())
            throw new IllegalArgumentException("Queue is empty");
        return queue[front++];
    }

    public boolean isFull() {
        return rear - front == queue.length - 1;
    }

    public String toString() {
        var queueContent = Arrays.copyOfRange(queue, front, rear);
        return Arrays.toString(queueContent);
    }
}
