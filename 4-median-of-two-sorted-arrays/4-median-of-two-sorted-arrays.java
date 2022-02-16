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

/* 分割两个array 确保 array1 左边的值一定下雨 array2 右边的值 （a2 左 < a1 右边）
    同时 左边的数量 等于 右边
    
array1 = x1 x2 x3 / x4 x5 x6 

array2 = y1 y2 y3 y4 / y5 y6 y7 y8
    
    
x3 < y5 && y4 < x4
左边 3 + 4 = 右边 3 + 4
    
    
*/
