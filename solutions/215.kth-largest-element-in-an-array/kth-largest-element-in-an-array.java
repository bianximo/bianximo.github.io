public class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums==null||nums.length==0)return 0;
        return res(nums,0,nums.length-1,k);
    }
    public int res(int[]nums,int begin,int end,int k){
        if(begin==end)return nums[begin];
        int low = begin,high = end;
        int pro = nums[begin];
        while(low<high){
            while(nums[high]>pro&&low<high)high--;
            if(low<high)swap(nums,low++,high);
            while(nums[low]<=pro&&low<high)low++;
            if(low<high)swap(nums,low,high--);
        }
        if(nums.length-low==k)return nums[low];
        else if(nums.length-low>k)return res(nums,low+1,end,k);
        else return res(nums,begin,low-1,k);
    }
    public void swap(int[]nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}