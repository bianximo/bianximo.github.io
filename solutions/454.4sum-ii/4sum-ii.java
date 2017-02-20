public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<C.length;i++){
            for(int j=0;j<D.length;j++){
                int sum = C[i]+D[j];
                int a = map.getOrDefault(sum,0);
                map.put(sum,a+1);
            }
        }
        int result = 0;
        for(int i = 0;i<A.length;i++){
            for(int j= 0;j<B.length;j++){
                result+=map.getOrDefault(-(A[i]+B[j]),0);
            }
        }
        return result;
    }
}