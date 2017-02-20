public class Solution {
    public int findDuplicate(int[] nums) {
        int length = nums.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(nums[i]==nums[j])return nums[i];
            }
        }
        return 0;
    }
}