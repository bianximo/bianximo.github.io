public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        if(houses==null||heaters==null)return 0;
        int res = Integer.MIN_VALUE;
        Arrays.sort(heaters);
        for(int i :houses){
            int index = Arrays.binarySearch(heaters,i);
            if(index<0)index = -(index+1);
            int dis1 = index>=1?i-heaters[index-1]:Integer.MAX_VALUE;
            int dis2 = index<heaters.length?heaters[index]-i:Integer.MAX_VALUE;
            res = Math.max(res,Math.min(dis1,dis2));
        }
        return res;
    }
}