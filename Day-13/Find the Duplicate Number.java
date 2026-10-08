class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap();

        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }

        for(int k:nums){
            if(freq.get(k)>1){
                return k;
            }
        }return -1;
    }
}
