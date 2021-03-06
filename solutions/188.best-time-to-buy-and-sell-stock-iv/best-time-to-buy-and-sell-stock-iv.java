public class Solution {
    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        if(k>=len/2)return easyMax(prices);
        int [][]nums = new int[k+1][len];
        for(int i=1;i<=k;i++){
            int temp = -prices[0];
            for(int j=1;j<len;j++){
                nums[i][j] = Math.max(nums[i][j-1],temp+prices[j]);
                temp = Math.max(temp,nums[i-1][j-1]-prices[j]);
            }
        }
        return nums[k][len-1];
        
    }
    public int easyMax(int[]nums){
        int result =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1])result+=nums[i]-nums[i-1];
        }
        return result;
    }
}