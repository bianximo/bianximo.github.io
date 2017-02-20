public class Solution {
    public int majorityElement(int[] nums) {
        if(nums==null||nums.length<=0)return 0;
        int n = nums[0],num = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==n)num++;
            else{
                num--;
                if(num==0){
                    num =1;
                    n=nums[i];
                }
            }
        }
        return n;
    }
}