class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size =nums.length;
        int brr [] = new int[size];
        for(int i =0;i<n;i++){
            brr[2*i]=nums[i];
            brr[2*i+1]=nums[i+n];
        }return brr;
    }
}
