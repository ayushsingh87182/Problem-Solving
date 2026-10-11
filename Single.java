class Single {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int result = 0;
        for(int i =0;i<n;i++){
            result = result^nums[i];

        }
        return result;
        
    }
    public static void main(String[] args) {
        Single obj = new Single();
        int[] nums = {4,1,2,1,2};
        System.out.println(obj.singleNumber(nums));
    }
}