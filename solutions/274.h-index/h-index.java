public class Solution {
    public int hIndex(int[] citations) {
        int hindex=0;
        int length = citations.length;
       int[]count = new int[citations.length+1];
       for(int i:citations){
           if(i>length)count[length]++;
           else count[i]++;
       }
       for(int i=length;i>0;i--){
           hindex+=count[i];
           if(hindex>=i)return i;
       }
       return 0;
    }
}