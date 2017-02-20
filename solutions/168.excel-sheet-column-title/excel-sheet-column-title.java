public class Solution {
    public String convertToTitle(int n) {
        List<Character>list = new ArrayList<>();
        while(n!=0){
            int now = n%26;
            char c = ' ';
            if(now==0)c = 'Z';
            else c = (char) (now-1 + 'A');
            list.add(c);
            n = (n-1)/26;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=list.size()-1;i>=0;i--)sb.append(list.get(i));
        return sb.toString();
    }
}