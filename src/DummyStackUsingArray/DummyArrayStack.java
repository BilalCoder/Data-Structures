package DummyStackUsingArray;

import java.util.Arrays;

public class DummyArrayStack {
    private int[] array = new int[5];
    private int topIndex = -1;    // -1 to indicate stack is empty

    public void push(int value) {
        if (topIndex == array.length-1)
            throw new StackOverflowError("Cannot push into ull stack");
        array[++topIndex] = value;
    }

    public int pop() {
        if (topIndex == -1)
            throw new IllegalStateException("Cannot pop from empty stack");
        return array[topIndex--];
    }

    public int peek() {
        if (topIndex == -1) {
            throw new IllegalArgumentException("No element present in stack");
        }
        return array[topIndex];
    }

    @Override
    public String toString() {
        var stackContent = Arrays.copyOfRange(array, 0, topIndex+1);
        return Arrays.toString(stackContent);
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

}
