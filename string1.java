import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        System.out.println("Is '" + s1 + "' valid? " + isValid(s1));

        String s2 = "()[]{}";
        System.out.println("Is '" + s2 + "' valid? " + isValid(s2));

        String s3 = "(]";
        System.out.println("Is '" + s3 + "' valid? " + isValid(s3));

        String s4 = "([)]";
        System.out.println("Is '" + s4 + "' valid? " + isValid(s4));

        String s5 = "{[]}";
        System.out.println("Is '" + s5 + "' valid? " + isValid(s5));
    }
}
