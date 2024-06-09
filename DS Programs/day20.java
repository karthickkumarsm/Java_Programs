import java.util.*;

public class day20 {

    public static boolean isValidExpression(String expression) {
    Stack<Character> stack = new Stack<>();
    boolean prevIsOperand = false;

    for (int i = 0; i < expression.length(); i++) {
        char ch = expression.charAt(i);

        if (ch == '(') {
            stack.push(ch);
            prevIsOperand = false; 
        } else if (ch == ')') {
            if (stack.isEmpty() || stack.pop() != '(') {
                return false;
            }
            prevIsOperand = true;
        } else if (isOperand(ch)) {
            if (prevIsOperand) {
                return false; 
            }
            prevIsOperand = true;
        } else if (isOperator(ch)) {
            if (!prevIsOperand) {
                return false; 
            }
            prevIsOperand = false;
        } else {
            return false;
        }
    }
    return stack.isEmpty() && prevIsOperand;
}

private static boolean isOperand(char ch) {
    return Character.isLetterOrDigit(ch);
}

private static boolean isOperator(char ch) {
    return ch == '+' || ch == '-' || ch == '*' || ch == '/';
}
    public static void main(String[] args) {
        System.out.println(isValidExpression("(a+b)(a*b)"));
        System.out.println(isValidExpression("(ab)(ab+)"));
        System.out.println(isValidExpression("((a+b)"));
    }
}
