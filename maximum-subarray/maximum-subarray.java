class Solution {
    public int maxSubArray(int[] nums) {
        
         int currentsum = nums[0];
         int maxsum =currentsum;

         for(int i = 1; i<nums.length; i++)
         {
             currentsum = Math.max(currentsum+nums[i] , nums[i]);
             maxsum = Math.max(currentsum, maxsum);
         }
         return maxsum;
    }
}