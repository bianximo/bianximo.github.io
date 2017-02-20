public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0)return 0;
        
        int max = Integer.MIN_VALUE,total = 0;
        int len = nums.length,j = 0;
        while(j<len){
            total+=nums[j];
            max = Math.max(total,max);
            if(total<0){
                total = 0;
            }
            j++;
        }
        return max;
    }
}