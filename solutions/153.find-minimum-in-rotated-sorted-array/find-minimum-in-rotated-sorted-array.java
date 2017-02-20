public class Solution {
    public int findMin(int[] nums) {
        if(nums==null||nums.length<=0)return -1;
        if(nums[0]<nums[nums.length-1])return nums[0];
        int begin = 0;
        int end = nums.length-1;
        while((end-begin)>1){
            int mid = (end+begin)/2;
            if(nums[mid]>nums[begin])begin = mid;
            else if(nums[mid]<nums[end])end = mid;
        }
        return nums[end];
    }
}