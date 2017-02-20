public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        if(input==null||input.length()==0)return new ArrayList<>();
        return recursion(input);
    }
    public List<Integer>recursion(String input){
        List<Integer>res = new ArrayList<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='+'||input.charAt(i)=='-'||input.charAt(i)=='*'){
                String first = input.substring(0,i);
                String last = input.substring(i+1);
                int num = 0;
                List<Integer>l1 = recursion(first);
                List<Integer>l2 = recursion(last);
                for(Integer m:l1){
                    for(Integer n:l2){
                        if(input.charAt(i)=='+')num = m+n;
                        else if(input.charAt(i)=='-')num = m-n;
                        else num = m*n;
                        res.add(num);
                    }
                }
            }
        }
        if(res.size()==0)res.add(Integer.valueOf(input));
        return res;
    }
}