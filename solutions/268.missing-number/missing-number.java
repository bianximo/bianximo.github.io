public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums==null||nums.length<=0)return 0;
        int i=0;
        for(;i<nums.length;i++){
            if(i!=nums[i])return i;
        }
        return i;
    }
}