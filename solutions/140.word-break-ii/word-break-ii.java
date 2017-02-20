public class Solution {
    Map<String,List<String>>map;
    public List<String> wordBreak(String s, List<String> dict) {
        map = new HashMap<>();
        return getBreak(s,dict);
    }
    private boolean containsSuffix(List<String> dict, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (dict.contains(str.substring(i))) return true;
        }
        return false;
    }

    public List<String>getBreak(String s,List<String>dict){
        if(map.containsKey(s))return map.get(s);
        List<String>list = new LinkedList<>();
        if(dict.contains(s)){
            list.add(s);
        }
        for(int i=0;i<s.length();i++){
            String left = s.substring(0,i),right = s.substring(i,s.length());
            if(dict.contains(left)&& containsSuffix(dict, right)){
                List<String>temp = getBreak(right,dict);
                for(String r : temp){
                    list.add(left+" "+r);
                }
            }
        }
        map.put(s,list);
        return list;
    }
}