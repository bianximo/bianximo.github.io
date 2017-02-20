public class Solution {
    public int reverse(int x) {
        int Positive = x>0?1:-1;
        x = Math.abs(x);
        Long total = 0L;
        int now = 0,mul = 10;
        while(x!=0){
            now = x%mul;
            total = total*10+now;
            x = x/mul;
        }
        total = total*Positive;
        if(total>Integer.MAX_VALUE||total<Integer.MIN_VALUE)return 0;
        int result = total.intValue();
        return result;
    }
}