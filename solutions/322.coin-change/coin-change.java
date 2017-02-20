public class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[]dp = new int[amount+1];
        dp[0] = 0;
        for(int i=1;i<=amount;i++){
        	int minNum = Integer.MAX_VALUE;
        	for(int j=0;j<coins.length;j++){
        		if(i<coins[j])break;
        		if(dp[i-coins[j]]==Integer.MAX_VALUE)continue;
        		minNum = Math.min(minNum,dp[i-coins[j]]+1);
        	}
        	dp[i] = minNum;
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}