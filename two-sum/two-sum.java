import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hm = new HashMap <Integer, Integer>();
        int [] result = new int [2];
        for(int i=0; i < nums.length; i++){
            if(hm.containsKey(target-nums[i]))
                return new int[]{i,hm.get(target-nums[i])};
            hm.put(nums[i],i);
        }
         
        return null;
    }
}