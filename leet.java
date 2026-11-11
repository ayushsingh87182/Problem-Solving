class leet {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int count = 0;
        
        while (xor > 0) {
            xor &= (xor - 1);
            count++;
        }
        
        return count;
    }
    public static void main(String[] args) {
        leet solution = new leet();

        int start1 = 10, goal1 = 7;
        int start2 = 3, goal2 = 4;

        System.out.println("Result of minBitFlips(" + start1 + ", " + goal1 + ") = " + solution.minBitFlips(start1, goal1));
        System.out.println("Result of minBitFlips(" + start2 + ", " + goal2 + ") = " + solution.minBitFlips(start2, goal2));
    }
}