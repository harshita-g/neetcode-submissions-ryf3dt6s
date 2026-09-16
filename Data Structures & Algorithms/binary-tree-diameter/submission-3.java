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
    int dimo = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dimo=0;
        dim(root);
        return dimo;

        
    }
    public int dim(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = dim(root.left);
        int right = dim(root.right);
        
        dimo = Math.max(dimo, (left+right));
        return 1+Math.max(left,right);
    }
}
