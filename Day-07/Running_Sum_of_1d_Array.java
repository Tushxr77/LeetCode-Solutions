class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int length = nums.length;
        int brr [] = new int[length];

        for(int i = 0;i<length;i++){
            int element = nums[i];
            sum = sum + element;
            brr[i] = sum;
        }return brr;
        
    }
}
