class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int startIndex = 0;
        int endIndex = n-1;

        int midIndex = (startIndex+endIndex)/2;
        while(startIndex<=endIndex){
        if(nums[midIndex]==target){
            return midIndex;
        }else if(target>nums[midIndex]){
            startIndex=midIndex+1;
        }
        else {
            endIndex=midIndex-1;
        }
        midIndex=(startIndex+endIndex)/2;
        }return -1;
    }
}
