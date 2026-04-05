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
//harshita
class Solution {
    //use static for global variable in java
    static int res=0;
    public int dfs(TreeNode curr){
        if(curr==null){
            return 0;
        }
        int left = dfs(curr.left);
        int right = dfs(curr.right);

        res=Math.max(res,left+right);
        return 1+Math.max(left,right);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        res=0;
        dfs(root);
        return res;        
    }
}
