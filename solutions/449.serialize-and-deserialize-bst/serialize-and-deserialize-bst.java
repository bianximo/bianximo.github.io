/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public static final String SEP = ",";
	private static final String NULL = "null";
    public String serialize(TreeNode root) {
        StringBuilder s = new StringBuilder();
        if(root==null)return NULL;
        Stack<TreeNode>stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            s.append(node.val).append(SEP);
            if(node.right!=null)stack.push(node.right);
            if(node.left!=null)stack.push(node.left);
        }
        return s.toString();
    }
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals(NULL)) return null;
        String[] strs = data.split(SEP);
        Queue<Integer> q = new LinkedList<>();
        for (String e : strs) {
            q.offer(Integer.parseInt(e));
        }
        return getNode(q);
    }
    private TreeNode getNode(Queue<Integer> q) { //q: 5,3,2,6,7
        if(q.isEmpty())return null;
        TreeNode root = new TreeNode(q.poll());
        Queue<Integer>smallQueue = new LinkedList<>();
        while(!q.isEmpty()&&q.peek()<=root.val){
            smallQueue.offer(q.poll());
        }
        root.left = getNode(smallQueue);
        root.right = getNode(q);
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));