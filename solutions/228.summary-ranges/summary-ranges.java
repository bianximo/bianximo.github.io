public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>list = new ArrayList<>();
        if(nums==null||nums.length<=0)return list;
        if(nums.length==1){
            list.add(nums[0]+"");
            return list;
        }
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            while(i<nums.length-1&&(nums[i+1]-nums[i]==1))i++;
            if(a==nums[i]){
                list.add(a+"");
            }else{
                list.add(a+"->"+nums[i]);
            }
        }
        return list;
    }
}