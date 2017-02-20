public class Solution {
    String last = "1";
    public String countAndSay(int n) {
    if(n<=0)return "";
    if(n==1)return "1";
        for(int i=1;i<n;i++){
            last = getString();
        }
    return last;
    }
    public String getString(){
         StringBuilder s = new StringBuilder();
         int i=0,j = 0,count=0;
         char now = ' ';
         while(true){
             if(j==last.length())break;
             if(last.charAt(i)==last.charAt(j)){
                 count++;
                 j++;
             }
             else{
                 s.append(count).append(last.charAt(i));
                 i = j;
                 count=0;
             }
         }
         s.append(count).append(last.charAt(i));
         return s.toString();
    }
}