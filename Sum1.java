class Sum1 {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0;
        int rp = numbers.length-1;
        while(lp<rp){
            if(numbers[lp] + numbers[rp]==target){
                return new int[]{lp + 1, rp + 1};
            }
            if(numbers[lp]+numbers[rp]<target){
                lp++;
                
            }else{
                rp--;
            }
        }

        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        Sum1 obj = new Sum1();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = obj.twoSum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}