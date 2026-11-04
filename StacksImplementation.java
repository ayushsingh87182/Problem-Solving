
import java.util.*;

class StacksImplementation {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public StacksImplementation() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
    public static void main(String[] args) {
        StacksImplementation stack = new StacksImplementation();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); // Output: 3
        System.out.println("Popped element: " + stack.pop()); // Output: 3
        System.out.println("Is stack empty? " + stack.empty()); // Output: false

        stack.pop();
        stack.pop();
        System.out.println("Is stack empty? " + stack.empty()); // Output: true
    }
}
