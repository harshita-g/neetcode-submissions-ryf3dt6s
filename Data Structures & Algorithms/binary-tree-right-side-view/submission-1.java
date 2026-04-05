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
    public List<Integer> rightSideView(TreeNode root) {

        if(root==null){
            return new ArrayList<>();
        }
        
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int level = q.size();
            TreeNode lastnode = null;

            for(int i=0;i<level;i++){
                TreeNode temp = q.poll();
                lastnode = temp;

                if(temp.left!=null){
                    q.add(temp.left);

                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            ans.add(lastnode.val);
        }
        return ans;
        
    }
}
