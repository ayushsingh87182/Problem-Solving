
class SubRange {
    public long subArrayRanges(int[] nums) {
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int max = nums[i];

            for (int j = i; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);

                sum += (long) max - min;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        SubRange solution = new SubRange();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 3, 3};
        int[] nums3 = {4, -2, -3, 4, 1};

        System.out.println("Result of subArrayRanges(nums1) = " + solution.subArrayRanges(nums1));
        System.out.println("Result of subArrayRanges(nums2) = " + solution.subArrayRanges(nums2));
        System.out.println("Result of subArrayRanges(nums3) = " + solution.subArrayRanges(nums3));
    }
}
