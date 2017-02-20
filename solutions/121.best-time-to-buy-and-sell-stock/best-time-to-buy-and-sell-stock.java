public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1)return 0;
        int[]nums = new int[prices.length-1];
        for(int i=1;i<prices.length;i++){
            nums[i-1] = prices[i]-prices[i-1];
        }
        return max(nums);
    } 
    public int max(int [] nums){
        int preMax=0,m=0;
        for(int i=0;i<nums.length;i++){
            preMax = Math.max(preMax+nums[i],0);
            m = Math.max(m,preMax);
            
        }
        return m;
    }
    
}