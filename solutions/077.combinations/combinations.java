public class Solution {
    List<List<Integer>>list;
    public List<List<Integer>> combine(int n, int k) {
        list = new ArrayList<>();
        if(n<=0||k<=0||k>n)return list;
        List<Integer> temp = new ArrayList<>();
        combine(n,1,k,temp);
        return list;
    }
    public void combine(int n,int begin,int num,List<Integer>temp){
        if(num==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        else if(begin>n){
            return;
        }
        temp.add(begin);
        combine(n,begin+1,num-1,temp);
        temp.remove(temp.size()-1);
        combine(n,begin+1,num,temp);
    }
}