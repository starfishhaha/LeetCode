class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList <>();
        for(int i=0; i<nums.length;i++){
            if(i ==0 || nums[i-1] != nums[i]){
                twoSum(nums, i, list);
            }
        }
        return list;
        
    }
    public void twoSum(int [] nums, int i, List<List<Integer>> list){
        var hs = new HashSet<Integer>();
        for(int j=i+1; j<nums.length; ++j){
            int complement = -nums[i] - nums[j];
            if(hs.contains(complement)){
                list.add(Arrays.asList(nums[i], nums[j], complement));
                while(j+1<nums.length && nums[j] == nums[j+1]){
                    ++j;
                }
            }
            hs.add(nums[j]);
        }
    }
}