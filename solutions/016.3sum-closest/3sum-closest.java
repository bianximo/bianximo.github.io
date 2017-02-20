public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null||nums.length<3)return 0;
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<=nums.length-3;i++){
            int a = i+1,b = nums.length-1;
            while(a<b){
                int total = nums[i]+nums[a]+nums[b];
                if(total<target)a++;
                else b--;
                if(Math.abs(result-target)>Math.abs(total-target))result = total;
            }
        }
        return result;
    }
}