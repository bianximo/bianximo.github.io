public class Solution {
    List<List<Integer>>list;
    public List<List<Integer>> fourSum(int[] nums, int target) {
        list = new ArrayList<>();
        if(nums==null||nums.length==0)return list;
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-4;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            for(int j=i+1;j<=nums.length-3;j++){
                if(j>i+1&&nums[j]==nums[j-1])continue;
                int num = target-nums[i]-nums[j];
                int begin = j+1,end = nums.length-1;
                while(begin<end){
                    int left = nums[begin]+nums[end];
                    if(left==num){
                        list.add(Arrays.asList(nums[i],nums[j],nums[begin],nums[end]));
                        while(begin<end&&nums[begin]==nums[begin+1])begin++;
                        while(begin<end&&nums[end]==nums[end-1])end--;
                        begin++;
                        end--;
                    }else if(left<num){
                        begin++;
                    }else{
                        end--;
                    }
                }
            }
        }
        return list;
    }
}