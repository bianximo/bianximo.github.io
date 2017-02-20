public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0)return false;
        int row = getRow(matrix,target);
        return search(matrix,target,row);
    }
    public int getRow(int[][]matrix,int target){
        for(int i=0;i<matrix.length-1;i++){
            int first = matrix[i][0];
            int next = matrix[i+1][0];
            if(target>=first&&target<next)return i;
        }
        return matrix.length-1;
    }
    public boolean search(int[][]matrix,int target,int row){
        int[]nums = matrix[row];
        int begin = 0,end = nums.length-1;
        while(begin<end){
            int mid = (begin+end)/2;
            if(nums[mid]==target)return true;
            else if(nums[mid]<target)begin = mid+1;
            else end = mid-1;
        }
        return nums[begin]==target;
    }
}