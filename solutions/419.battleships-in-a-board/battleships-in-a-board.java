public class Solution {
    public int countBattleships(char[][] board) {
        int n = board[0].length;//列
        int m = board.length;//行
        int num = 0;
        int[][]visited = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]==0&&board[i][j]=='X'){
                    num++;
                    dfs(board,visited,i,j);
                }
            }
        }
        return num;
    }
    private void dfs(char[][]board,int[][]visited,int i,int j){
        visited[i][j]=1;
        int n = board[0].length;//列
        int m = board.length;//行
        if(i>0&&visited[i-1][j]==0&&board[i-1][j]=='X'){
            dfs(board,visited,i-1,j);
        }if(i<m-1&&visited[i+1][j]==0&&board[i+1][j]=='X'){
             dfs(board,visited,i+1,j);
        }if(j>0&&visited[i][j-1]==0&&board[i][j-1]=='X'){
             dfs(board,visited,i,j-1);
        }if(j<n-1&&visited[i][j+1]==0&&board[i][j+1]=='X'){
             dfs(board,visited,i,j+1);
        }
    }
}