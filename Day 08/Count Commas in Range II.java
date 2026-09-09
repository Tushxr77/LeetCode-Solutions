class Solution {
    public long countCommas(long n) {
        long crr =1000;
        long res =0;
        while(crr<=n){
            res +=n-crr+1;
            crr *=1000;
        }return res;
        
    }
}
