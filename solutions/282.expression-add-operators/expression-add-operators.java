public class Solution {
    List<String>list;
    public List<String> addOperators(String num, int target) {
        list = new ArrayList<>();
        if(num==null||num.length()==0)return list;
        recursion(num,"",target,0,0,0);
        return list;
    }
    public void recursion(String num,String path,int target,int index,long total,long last){
        int len = num.length();
        if(index==len&&total==target){
            list.add(path);
            return;
        }
        for(int i = index;i<len;i++){
           if(i!=index&&num.charAt(index)=='0')break;
           long now = Long.parseLong(num.substring(index,i+1));
           if(index==0)recursion(num,path+now,target,i+1,total+now,now);
           else{
                recursion(num,path+"+"+now,target,i+1,total+now,now);
                recursion(num,path+"-"+now,target,i+1,total-now,-now);
                recursion(num,path+"*"+now,target,i+1,total-last+last*now,last*now);
           }
        }
    }
}