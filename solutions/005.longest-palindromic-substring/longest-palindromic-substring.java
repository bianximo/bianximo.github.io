public class Solution {
   
     int index=0,maxLen=1;
    public String longestPalindrome(String s) {
        if(s==null||s.length()<2)return s;
        String res = "";
        for(int i=0;i<s.length()-1;i++){
           getMax(s,i,i);
           getMax(s,i,i+1);
        }
        return s.substring(index,index+maxLen);
    }
    public void getMax(String s,int i,int j){
        int len = s.length();
        int ind = 0,maxl = i==j?-1:0;
        for(int k=0;i-k>=0&&j+k<len;k++){
            if(s.charAt(i-k)==s.charAt(j+k)){
                maxl+=2;
                ind = i-k;
            }else break;
        }
        if(maxl>maxLen){
            maxLen = maxl;
            index = ind;
        }
    }
}