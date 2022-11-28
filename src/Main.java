import linkedlistpackage.DummyLinkedList;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag;
        while (sc.hasNext()) {
             flag = true;
            String s=sc.next();

            Stack<Character> stack = new Stack();
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
                    stack.push(s.charAt(i));
                else if (stack.isEmpty() || (s.charAt(i) == ']' && stack.pop() != '['
                        || s.charAt(i) == '}' && stack.pop() != '{'
                        || s.charAt(i) == ')' && stack.pop() != '(')) {
                    flag = false;

                }
            }
            System.out.println(stack.isEmpty() && flag ? "true" : "false");
        }


    }
}
