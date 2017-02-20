public class Solution {
    int[] visited;
    public int numTrees(int n) {
        if(n<=1)return n;
        visited = new int[n+1];
        visited[0] = 1;
        visited[1] = 1;
        return getNum(n);
    }
    public int getNum(int n){
        if(visited[n]!=0)return visited[n];
            int total = 0;
            for(int i=1;i<=n;i++){
                total=total+getNum(i-1)*getNum(n-i);
            }
            visited[n] = total;
            return total;
    }
}