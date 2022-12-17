import java.util.Stack;

public class PostfixEvaluation {

    public static void main(String[] args) {
        String[] str = {"2","1","+","3","*"};
        String[] str1 = {"4","13","5","/","+"};
        System.out.println(evalRPN(str));
        System.out.println(evalRPN(str1));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();

        for(String token : tokens) {
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int value2 = stack.pop();
                int value1 = stack.pop();
                switch(token) {
                    case "+": stack.push(value1 + value2); break;
                    case "-": stack.push(value1 - value2); break;
                    case "*": stack.push(value1 * value2); break;
                    case "/": stack.push(value1 / value2); break;
                }
            }
            else
                stack.push(Integer.valueOf(token));
        }
        return stack.peek();
    }
}
