import java.util.Scanner;
import java.util.Stack;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        Stack stack = new Stack();
        char[] ch = str.toCharArray();
        for(char character : ch)
            stack.push(character);

        StringBuffer stringBuffer = new StringBuffer();
        while (!stack.empty())
            stringBuffer.append(stack.pop());
        return stringBuffer.toString();
    }

}
