class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int ans=0;
        Arrays.sort(nums);
        for(int i=n-1;i>=0;i--){
             ans=(nums[n-k]);
        }return ans;
    }
}
