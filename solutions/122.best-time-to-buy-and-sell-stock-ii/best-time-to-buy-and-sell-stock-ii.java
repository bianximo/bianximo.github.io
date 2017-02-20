public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1)return 0;
        int result = 0;
        for(int i=1;i<prices.length;i++){
            int pro = prices[i]-prices[i-1];
            if(pro>0)result+=(pro);
        }
        return result;
    }
}