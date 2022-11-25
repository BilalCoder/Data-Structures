import java.util.*;

public class CheckBalanceParenthesis {

    private List leftBrackets = Arrays.asList('(', '[', '{', '<');
    private List rightBrackets = Arrays.asList(')', ']', '}', '>');

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        CheckBalanceParenthesis checkBalanceParenthesis = new CheckBalanceParenthesis();
        System.out.println(checkBalanceParenthesis.isExpressionValid(str));
    }

     private boolean isExpressionValid(String str) {
        Stack<Character> stack = new Stack<>();
        char[] ch = str.toCharArray();
        char top;
        for(char character : ch) {
            if (isLeftCharacter(character))
                stack.push(character);
            else if (isRightCharacter(character)) {
                if (stack.empty())
                    return false;
                top = stack.pop();
                return isMatched(character, top);
            }
        }
        return stack.empty();
    }

    private boolean isLeftCharacter(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightCharacter(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean isMatched(char ch, char top) {
        return leftBrackets.indexOf(ch) == rightBrackets.indexOf(top);
    }

}
