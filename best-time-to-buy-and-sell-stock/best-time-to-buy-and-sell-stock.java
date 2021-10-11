import java.lang.Math.*;
class Solution {
    public int maxProfit(int[] prices) {
        int maxCurr = 0, maxSofar = 0;
        if(prices.length == 0 || prices.length == 1) return 0;
        for(int i=1;i<prices.length;i++){
            // adding difference and compare max difference
            maxCurr = Math.max(0, maxCurr+= prices[i] - prices[i-1]);
            maxSofar = Math.max(maxCurr, maxSofar);
        }
        return maxSofar;
        
    }
}