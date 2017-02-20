public class Solution {
    public boolean isPerfectSquare(int num) {
        
        long begin = 0,end = num;
        while(begin<=end){
            long mid = begin+(end-begin)/2;
            if(mid*mid==num)return true;
            if(mid*mid>num)end = mid-1;
            if(mid*mid<num)begin = mid+1;
        }
        return false;
    }
}