/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {
    public NestedInteger deserialize(String s) {
        if(s==null||s.length()==0)return null;
        if(s.charAt(0)!='[')return new NestedInteger(Integer.parseInt(s));
        int l = 0;
        NestedInteger cur = null;
        Stack<NestedInteger>stack = new Stack<>();
        for(int j = 0;j<s.length();j++){
            char now = s.charAt(j);
            if(now=='['){
               if(cur!=null)stack.push(cur);
               cur  = new NestedInteger();
               l = j+1;
            }else if(now==']'){
                String num = s.substring(l,j);
                if(num!=null&&num.length()>0){
                    cur.add(new NestedInteger(Integer.parseInt(num)));
                }
                if(!stack.isEmpty()){
                    NestedInteger temp = stack.pop();
                    temp.add(cur);
                    cur = temp;
                }
                l = j+1;
                
            }else if(now==','){
                String num = s.substring(l,j);
                if(num!=null&&num.length()>0){
                    cur.add(new NestedInteger(Integer.parseInt(num)));
                }
                l = j+1;
            }
        }
        return cur;
    }
}