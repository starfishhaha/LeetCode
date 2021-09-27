class Solution {
    public int removeElement(int[] nums, int val) {
        int i = nums.length-1;
        int j=i;
        //int num = length;
        while(i>=0){
            if(nums[i] == val){
                nums[i] = nums[j];
                i--;
                j--;
            }
            else 
                i--;
        }
        return j+1;
        
    }
}