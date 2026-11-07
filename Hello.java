class Hello {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int sign = 1;

        if ((dividend < 0 && divisor > 0) ||
            (dividend > 0 && divisor < 0)) {
            sign = -1;
        }

        long ans = 0;

        while (a >= b) {
            long temp = b;
            long multiple = 1;

            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            ans += multiple;
        }

        return (int) (sign * ans);
    }
    public static void main(String[] args) {
        Hello solution = new Hello();

        int dividend1 = 10, divisor1 = 3;
        int dividend2 = 7, divisor2 = -3;
        int dividend3 = 0, divisor3 = 1;
        int dividend4 = 1, divisor4 = 1;
        int dividend5 = Integer.MIN_VALUE, divisor5 = -1;

        System.out.println("Result of " + dividend1 + " / " + divisor1 + " = " + solution.divide(dividend1, divisor1)); // Output: 3
        System.out.println("Result of " + dividend2 + " / " + divisor2 + " = " + solution.divide(dividend2, divisor2)); // Output: -2
        System.out.println("Result of " + dividend3 + " / " + divisor3 + " = " + solution.divide(dividend3, divisor3)); // Output: 0
        System.out.println("Result of " + dividend4 + " / " + divisor4 + " = " + solution.divide(dividend4, divisor4)); // Output: 1
        System.out.println("Result of " + dividend5 + " / " + divisor5 + " = " + solution.divide(dividend5, divisor5)); // Output: 2147483647 (Integer.MAX_VALUE)
    }
}