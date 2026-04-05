/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        // int l=0;
        // int r=0;
        // if(root.left!=null){
        //     l= 1+maxDepth(root.left);
        // }
        // if(root.right!=null){
        //     r= 1+maxDepth(root.right);
        // }
        // return Math.max(l,r);
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        
    }
}
