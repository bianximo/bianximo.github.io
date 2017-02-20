/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n==0)return new ArrayList<>();
        return generate(1,n);
    }
    public List<TreeNode> generate(int begin,int end){
        List<TreeNode> list = new ArrayList<>();
        if(begin>end)list.add(null);
        else if(begin==end)list.add(new TreeNode(begin));
        else for(int i=begin;i<=end;i++){
            List<TreeNode>left = generate(begin,i-1);
            List<TreeNode>right  = generate(i+1,end);
            for(TreeNode l:left){
                for(TreeNode r:right){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    list.add(root);
                }
            }
        }
        return list;
    }
}