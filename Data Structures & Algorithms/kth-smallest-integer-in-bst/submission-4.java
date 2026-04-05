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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> result = new ArrayList<>(); 
        it(root,result);
       
        return result.get(k-1);        
    }
    public ArrayList<Integer> it(TreeNode root, ArrayList<Integer> temp){
        if (root==null){
            return null;
        }
        it(root.left,temp);
        temp.add(root.val);
        it(root.right,temp);

        return temp;
    }
}
