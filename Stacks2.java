import java.util.ArrayDeque;
import java.util.Deque;

class Stacks2 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Stacks2 solution = new Stacks2();

        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";

        System.out.println("Is \"" + s1 + "\" valid? " + solution.isValid(s1)); // Output: true
        System.out.println("Is \"" + s2 + "\" valid? " + solution.isValid(s2)); // Output: true
        System.out.println("Is \"" + s3 + "\" valid? " + solution.isValid(s3)); // Output: false
        System.out.println("Is \"" + s4 + "\" valid? " + solution.isValid(s4)); // Output: false
        System.out.println("Is \"" + s5 + "\" valid? " + solution.isValid(s5)); // Output: true
    }
}