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
        if(root==null){
            return -1;
        }
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode pre=null;
        while(root!=null || !s.isEmpty()){
            while(root!=null){
                s.push(root);
                root=root.left;       

            }

        root = s.pop();
        res.add(root.val);
        pre=root;
        root=root.right;
        }
        int ans=-1;
        for(int i=0;i<k;i++){
            ans = res.get(i);
        }

        return ans;
        
    }
}
