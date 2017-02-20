/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(n<=0)return 0;
        return guessNum(1,n);
    }
    public int guessNum(int begin,int end){
        int mid = begin+(end-begin)/2;
        int res = guess(mid);
        if(res==0)return mid;
        else if(res==1){
            begin = mid+1;
            return guessNum(begin,end);
        }else{
            end = mid-1;
            return guessNum(begin,end);
        }
    }
}