public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        if(s==null||s.length()<=1)return s;
        StringBuilder sb = new StringBuilder();
        char[]string = s.toCharArray();
        reverse(string,0,string.length-1);
        int i=0,len=0;
        while(i+len<string.length){
            while(i+len<string.length&&string[i+len]!=' ')len++;
            reverse(string,i,i+len-1);
            sb.append(string,i,len).append(' ');
            while(i+len<string.length&&string[i+len]==' ')len++;
            i = i+len;
            len = 0;
        }
        if(sb.length()>0)sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    public void reverse(char[]string,int begin,int end){
        while(begin<end){
            char temp = string[begin];
            string[begin] = string[end];
            string[end] = temp;
            begin++;
            end--;
        }
    }
}