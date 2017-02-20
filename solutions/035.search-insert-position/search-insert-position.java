public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums==null||nums.length==0)return 0;
        int i=0,j=nums.length-1;
        while(i<j){
            int mid = (i+j)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]>target)j = mid-1;
            else i = mid+1;
        }
        if(nums[i]>=target)return i;
        else return i+1;
    }
}