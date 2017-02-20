public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums==null||nums.length==0)return -1;
        if(nums.length==1)return 0;
        int begin = 0,end =nums.length-1;
        while(begin<=end){
            int mid = begin+(end-begin)/2;
            if(isPeak(nums,mid))return mid;
            if(mid==0||nums[mid+1]>nums[mid])begin = mid+1;
            else if(mid==nums.length-1||nums[mid-1]>nums[mid])end = mid-1;
        }
        return -1;
    }
    public boolean isPeak(int[]nums,int index){
        if(index==0){
          if(nums[0]>nums[1])  return true;
            else return false;
        }
        if(index==nums.length-1){
            if(nums[index]>nums[index-1])return true;
            else return false;
        }
        if(nums[index]>nums[index-1]&&nums[index]>nums[index+1])return true;
        return false;
    }
}