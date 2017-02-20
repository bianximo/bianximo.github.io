public class Solution {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length==0)return -1;
        int begin = 0,end = nums.length-1;
        while(begin<=end){
            int mid = begin+(end-begin)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]>=nums[begin]){
                if(target<nums[mid]&&target>=nums[begin])end = mid-1;
                else begin = mid+1;
            }
            else if(nums[mid]<=nums[end]){
                if(target<=nums[end]&&target>nums[mid])begin = mid+1;
                else end = mid-1;
            }
        }
        return -1;
    }
}