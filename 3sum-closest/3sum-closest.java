import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k= j+1; k<nums.length; k++){
                    int num = nums[i] + nums[j] + nums[k];
                    if(target > num){
                        min = Math.min(min , target - (nums[i] + nums[j] + nums[k]));
                        if(!ht.containsKey(min)){
                            ht.put(target - (nums[i] + nums[j] + nums[k]), nums[i] + nums[j] + nums[k]);
                        }
                    }
                    else if(target < num){
                        min = Math.min(min ,  nums[i] + nums[j] + nums[k] - target);
                        if(!ht.containsKey(min)){
                            ht.put(nums[i] + nums[j] + nums[k] - target, nums[i] + nums[j] + nums[k]);
                        }
                    }
                    else 
                        return target;
                   
                }
            }
        }
        return ht.get(min);
    }
}