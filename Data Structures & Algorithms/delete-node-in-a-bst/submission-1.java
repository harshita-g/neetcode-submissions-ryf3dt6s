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
    public TreeNode deleteNode(TreeNode root, int key) {
        // 0 or 1 child 
        //2 children 
        if (root==null){
            return null;
        }
        if (key<root.val){
            root.left = deleteNode(root.left,key);
        }
        else if (key>root.val){
            root.right = deleteNode(root.right,key);
        }
        else{
            if (root.left ==null){
                root = root.right;
            }
            else if (root.right==null){
                root= root.left;

            }
            else{
                TreeNode minval = minvalue(root.right);
                root.val = minval.val;
                root.right = deleteNode(root.right,minval.val);

            }
        }
        return root;

        
    }
    public TreeNode minvalue(TreeNode root){
        TreeNode cur = root;
        while(cur!=null && cur.left !=null){
            cur = cur.left;
        }
        return cur;
    }
}