class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0 && nums2.length==0)
            return 0;
        else{
            int [] result = new int[nums1.length + nums2.length];
            System.arraycopy(nums1,0,result,0,nums1.length);
            System.arraycopy(nums2,0,result,nums1.length,nums2.length);
            
            //System.out.println(Arrays.toString(result));
            
            Arrays.sort(result);
            
            //System.out.println(Arrays.toString(result));
            
            if(result.length%2 == 0){
                //System.out.println(result[result.length/2-1] + " " + result[result.length/2]);
                return (Double.valueOf(result[result.length/2-1]) + Double.valueOf(result[result.length/2]))/2;
            }
             else
                 return result[result.length/2];
            
        }
    }
}
