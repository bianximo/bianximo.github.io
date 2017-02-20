public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null||needle==null||haystack.length()<needle.length())return -1;
        int len = needle.length();
        for(int i=0;i<=haystack.length()-len;i++){
            String t = haystack.substring(i,i+len);
            if(t.equals(needle))return i;
        }
        return -1;
    }
}