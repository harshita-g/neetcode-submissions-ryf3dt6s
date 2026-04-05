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
 //Bhoomika

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        Queue<TreeNode> q1= new LinkedList<>();


        q1.add(root);
        while(!q1.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
            int n = q1.size();
            for (int i = 0 ; i <n;i++){
                TreeNode cur = q1.poll();
                if (cur.left!=null){
                    q1.add(cur.left);
                }
                if (cur.right!=null){
                    q1.add(cur.right);
                }
            temp.add(cur.val);
            }
            result.add(temp);
        }
        return result;
    }
}
