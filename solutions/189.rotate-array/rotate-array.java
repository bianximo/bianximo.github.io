public class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0)return ;
        while(k>=nums.length){
            k-=nums.length;
        
        }
        change(nums,0,nums.length-1);
        change(nums,0,k-1);
        change(nums,k,nums.length-1);
        
    }
    public void change(int[]nums,int a,int b){
        if(a>=b)return;
        for(int i=a;i<=(a+b)/2;i++){
            int temp = nums[i];
            nums[i]=nums[b-i+a];
            nums[b-i+a]=temp;
        }
    }
}