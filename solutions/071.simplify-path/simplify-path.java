public class Solution {
   public  String simplifyPath(String path) {
        Stack<String>stack = new Stack<>();
        Set<String>skip = new HashSet<>(Arrays.asList("",".",".."));
        for(String now:path.split("/")){
        	if(now.equals("..")&&!stack.isEmpty())stack.pop();
        	else if(!skip.contains(now))stack.push(now);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<stack.size();i++){
        	sb.append("/").append(stack.get(i));
        }
        return sb.length()>0?sb.toString():"/";
    }
}