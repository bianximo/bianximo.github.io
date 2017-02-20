/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n<=0)return 0;
        int begin = 1,end = n;
        while(begin<end){
            int mid = begin+(end-begin)/2;
            if(!isBadVersion(mid))begin = mid+1;
            else if(mid>=2&&isBadVersion(mid-1))end = mid-1;
            else return mid;
        }
        return begin;
    }
}