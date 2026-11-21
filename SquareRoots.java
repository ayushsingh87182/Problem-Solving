
class SquareRoots {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1;
        int end = x / 2;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        SquareRoots solution = new SquareRoots();

        int x1 = 4;
        int x2 = 8;

        System.out.println("Result of mySqrt(" + x1 + ") = " + solution.mySqrt(x1));
        System.out.println("Result of mySqrt(" + x2 + ") = " + solution.mySqrt(x2));
    }
}