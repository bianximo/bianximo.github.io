public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums==null||nums.length==0)return 0;
        int k = nums.length-1;
        int res = 0;
        for(int i=0;i<=k;i++){
            if(nums[i]==val){
                swap(nums,i--,k--);
            }
            else res ++;
        }
        return res;
    }
    public void swap(int[]nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}