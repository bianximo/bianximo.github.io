public class Solution {
    public int hIndex(int[] citations) {
        if(citations==null||citations.length==0)return 0;
        int begin = 0,end = citations.length-1,max = 0,len = citations.length-1;
        while(begin<=end){
            int mid = begin+(end-begin)/2;
            int leftNum = len-mid+1;
            if(citations[mid]>=leftNum){
                max = Math.max(leftNum,max);
                end = mid-1;
            }else {
                begin = mid+1;
            }
        }
        return max;
    }
}