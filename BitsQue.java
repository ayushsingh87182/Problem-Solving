class BitsQue {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        BitsQue obj = new BitsQue();

        int num1 = 16;
        System.out.println(num1 + " is power of two: " + obj.isPowerOfTwo(num1));

        int num2 = 18;
        System.out.println(num2 + " is power of two: " + obj.isPowerOfTwo(num2));
    }
}