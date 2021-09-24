class Solution {
    public int reverse(int x) {
        //检查integer 是不是负值 
        boolean sign = true;
        if (x>=0) sign = true;
        else{
            sign = false;
            x = x*-1;
        }
        
        long rev=0;
        int last;
        while(x!=0){
            last = x%10;
            rev = rev*10 + last;
            x = x/10;
        }
        //开始是负数的话 最后加上负号
        if(sign==false) rev= rev*-1;
        if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE) return 0;
        else
            return (int)rev;
        
    }
}