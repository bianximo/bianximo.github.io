public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern==null||str==null||pattern.equals("")||str.equals(""))return false;
        Map<Character,String>map = new HashMap<>();
        String[]strs = str.split(" ");
        if(pattern.length()!=strs.length)return false;
        boolean flag = true;
        for(int i=0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(strs[i])){
                    flag=false;
                    break;
                }
                map.put(pattern.charAt(i),strs[i]);
            }else{
                if(!strs[i].equals(map.get(pattern.charAt(i)))){
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
}