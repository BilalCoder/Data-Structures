package DummyStackUsingArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DummyArrayStack stack = new DummyArrayStack();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
