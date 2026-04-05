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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        it(root,result);
        return result;

        
    }
    public  void it(TreeNode root,ArrayList<Integer> temp){
        if (root == null){
            return;
        }
        it (root.left,temp);
        temp.add(root.val);
        it(root.right,temp);


    }
}