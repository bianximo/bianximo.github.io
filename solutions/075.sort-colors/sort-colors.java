public class Solution {
    public void sortColors(int[] nums) {
        if(nums==null||nums.length<=1)return;
        int j=0,k=nums.length-1;
        for(int i=0;i<=k;i++){
            if(nums[i]==0&&i!=j){
                swap(nums,i--,j++);
            }else if(nums[i]==2&&i!=k){
                swap(nums,i--,k--);
            }
        }
    }
    public void swap(int[]nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}