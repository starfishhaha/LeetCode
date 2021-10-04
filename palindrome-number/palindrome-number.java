class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        if(x<0) return false;
        
        else{
            long rev = 0;
            int last ;
            while(y!=0){
                last =(int)y%10;
                rev = rev *10 + last;
                y = y/10;
            }
            if(rev>Integer.MAX_VALUE) return false;
            else if(rev == (int) x) return true;
            else return false;
        }
    }
}