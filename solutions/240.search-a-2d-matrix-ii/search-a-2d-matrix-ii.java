public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)return false;
        int i=0,j=matrix[0].length-1;
        while(i<matrix.length&&j>=0){
            int num = matrix[i][j];
            if(num==target)return true;
            else if(num>target)j--;
            else i++;
        }
        return false;
    }
}