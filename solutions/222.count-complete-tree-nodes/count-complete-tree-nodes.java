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
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int l = getDepth(root.left);
        int r = getDepth(root.right);
        if(l>r)return countNodes(root.left)+(1<<r);
        else return countNodes(root.right)+(1<<l);
    }
    public int getDepth(TreeNode root){
        int i=0;
        TreeNode cur = root;
        while(cur!=null){
            i++;
            cur = cur.left;
        }
        return i;
    }
}