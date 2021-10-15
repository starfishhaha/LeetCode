class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<nums.length;i++){
            if(!hs.contains(nums[i])) 
                hs.add(nums[i]);
            else
                hs.remove(nums[i]);
        }
        for(Integer i: hs){
            return i;
        }
        return 0;
    }
}