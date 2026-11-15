class DivideBit {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int sign = 1;

        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign = -1;
        }

        long result = 0;

        while (a >= b) {
            long temp = b;
            long multiple = 1;

            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            result += multiple;
        }

        return sign == -1 ? (int) -result : (int) result;
    }
    public static void main(String[] args) {
        DivideBit solution = new DivideBit();

        int dividend1 = 10;
        int divisor1 = 3;
        int dividend2 = 7;
        int divisor2 = -3;

        System.out.println("Result of divide(" + dividend1 + ", " + divisor1 + ") = " + solution.divide(dividend1, divisor1));
        System.out.println("Result of divide(" + dividend2 + ", " + divisor2 + ") = " + solution.divide(dividend2, divisor2));
    }
}