
import java.util.*;

class Ast {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!st.isEmpty() && asteroid < 0 && st.peek() > 0) {
                if (st.peek() < Math.abs(asteroid)) {
                    st.pop();
                } else if (st.peek() == Math.abs(asteroid)) {
                    st.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                st.push(asteroid);
            }
        }

        int[] result = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Ast solution = new Ast();

        int[] asteroids1 = {5, 10, -5};
        int[] asteroids2 = {8, -8};
        int[] asteroids3 = {10, 2, -5};
        int[] asteroids4 = {-2, -1, 1, 2};

        System.out.println("Result of asteroidCollision(asteroids1) = " + Arrays.toString(solution.asteroidCollision(asteroids1)));
        System.out.println("Result of asteroidCollision(asteroids2) = " + Arrays.toString(solution.asteroidCollision(asteroids2)));
        System.out.println("Result of asteroidCollision(asteroids3) = " + Arrays.toString(solution.asteroidCollision(asteroids3)));
        System.out.println("Result of asteroidCollision(asteroids4) = " + Arrays.toString(solution.asteroidCollision(asteroids4)));
    }
}
