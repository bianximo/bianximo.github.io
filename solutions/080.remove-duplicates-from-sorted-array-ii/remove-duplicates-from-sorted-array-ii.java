public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0)return 0;
        if(nums.length==1)return 1;
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if(res<=1||nums[i]!=nums[res-1]||nums[i]!=nums[res-2]){
                nums[res++] = nums[i];
            }
        }
        return res;
    }
}