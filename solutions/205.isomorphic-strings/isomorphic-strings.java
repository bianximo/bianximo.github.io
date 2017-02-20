public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null||t==null||s.length()!=t.length())return false;
        Map<Character,Character>map = new HashMap<>();
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(!map.containsKey(c1)){
                if(map.containsValue(c2)){
                    flag=false;
                    break;
                }
                map.put(c1,c2);
            }else{
                if(c2!=map.get(c1)){
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
}