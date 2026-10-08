class ConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maxcount = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }else{
                count = 0;
            }
        maxcount = Math.max(count,maxcount);
        }
        return maxcount;
    }
    public static void main(String[] args) {
        ConsecutiveOnes obj = new ConsecutiveOnes();
        int[] nums = {1,1,0,1,1,1};
        System.out.println(obj.findMaxConsecutiveOnes(nums));
    }
}