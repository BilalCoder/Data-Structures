package arrayQueue;

import java.util.Stack;

public class DummyQueueUsing2Stacks {

    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();

    public void enqueue(int value) {
        stack1.push(value);
    }

    public int dequeue() {
        moveStack1tiStack2();
        return stack2.pop();
    }

    private void moveStack1tiStack2() {
        if(stack2.isEmpty()) {
            if(stack1.isEmpty())
                throw new IllegalStateException("Queue is empty");
            else {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int peek() {
        moveStack1tiStack2();
        return stack2.peek();
    }

}
