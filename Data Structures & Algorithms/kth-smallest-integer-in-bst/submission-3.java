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

// sort print 
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root,res);
        return (res.get(k-1));
        
    }
    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> temp){
        if (root==null){
            return null;
        }
        inorder(root.left,temp);
        temp.add(root.val);
        inorder(root.right,temp);

        return temp;
    }
}
