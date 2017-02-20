public class Solution {
    public int countDigitOne(int n) {
        if(n<=0)return 0;
        Long total = 0L;
        Long base = 1L;
        while(base<=n){
            long now = (n/base)%10;
            long low = n-(n/base)*base;
            long high = n/base/10;
            if(now>1){
                total = total+base*(high+1);
            }else if(now==1){
                total = total+base*high+low+1;
            }else {
                total = total+high*base;
            }
                base = base*10;
        }
        if(total>Integer.MAX_VALUE)return Integer.MAX_VALUE;
        return total.intValue();
    }
}