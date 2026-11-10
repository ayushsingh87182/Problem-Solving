import java.util.ArrayList;
import java.util.List;

public class Para {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }

        if (open < max) {
            current.append('(');
            backtrack(result, current, open + 1, close, max);
            current.deleteCharAt(current.length() - 1);
        }

        if (close < open) {
            current.append(')');
            backtrack(result, current, open, close + 1, max);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        Para solution = new Para();

        int n1 = 3;
        int n2 = 1;

        System.out.println("Result of generateParenthesis(" + n1 + ") = " + solution.generateParenthesis(n1));
        System.out.println("Result of generateParenthesis(" + n2 + ") = " + solution.generateParenthesis(n2));
    }
}