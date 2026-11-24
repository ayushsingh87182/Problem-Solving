
class SumSubarray {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = 1000000007;

        int[] left = new int[n];
        int[] right = new int[n];

        java.util.Stack<Integer> st = new java.util.Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            long l = i - left[i];
            long r = right[i] - i;

            ans = (ans + (l * r * arr[i]) % mod) % mod;
        }

        return (int) ans;
    }
    public static void main(String[] args) {
        SumSubarray solution = new SumSubarray();

        int[] arr1 = {3, 1, 2, 4};
        int[] arr2 = {11, 81, 94, 43, 3};

        System.out.println("Result of sumSubarrayMins(arr1) = " + solution.sumSubarrayMins(arr1));
        System.out.println("Result of sumSubarrayMins(arr2) = " + solution.sumSubarrayMins(arr2));
    }
}
