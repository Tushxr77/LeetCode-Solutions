class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = 0;
        int num = 0;
         int org =x;
        while(x!=0){
       
           num = x%10;
            rev = rev*10+num;
            x = x/10;
        }if (rev == org){
            return true;
        }return false;
        
    }
}
