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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list = new ArrayList<>();
         poster(root,list);
        return  list;
    }
    private void poster(TreeNode node ,List<Integer>list){
       if(node==null)return;
       if(node.left!=null)poster(node.left,list);
       if(node.right!=null)poster(node.right,list);
       list.add(node.val);
    }
}