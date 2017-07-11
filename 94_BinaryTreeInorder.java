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
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode curNode = root;
        List<Integer> res = new ArrayList<Integer>();        
        // visit node
        if (curNode != null) {
            // visit left tree
            List<Integer> leftRes = inorderTraversal(root.left);
            // visit right tree
            List<Integer> rightRes = inorderTraversal(root.right);        
            res.addAll(leftRes);
	        res.add(curNode.val);      
            
            res.addAll(rightRes);            
        } 

       
        
       return res;
        
    }
}
