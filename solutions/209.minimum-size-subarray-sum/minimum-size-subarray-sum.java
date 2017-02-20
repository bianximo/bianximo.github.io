public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums==null||nums.length==0)return 0;
        int low = 0,high=0;
        int len = Integer.MAX_VALUE,total = nums[low];
        while(low<=high&&high<nums.length){
            if(total<s){
                high++;
                if(high>=nums.length)break;
                total+=nums[high];
            }else{
                if(high==low)return 1;
                len = Math.min(len,high-low+1);
                total-=nums[low];
                low++;
            }
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}