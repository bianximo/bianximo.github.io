public class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null)return 0;
        s = s.trim();
        if(s.length()==0)return 0;
        int len = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ')break;
            len++;
        }
        return len;
    }
}