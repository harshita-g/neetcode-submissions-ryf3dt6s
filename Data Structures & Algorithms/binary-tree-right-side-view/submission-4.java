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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();
        res = lo(root);

        for(int i= 0 ; i <res.size();i++){
            int k = res.get(i).size();
            temp2.add(res.get(i).get(k-1));
            
        }
        return temp2;

    }
    public List<List<Integer>> lo(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        if (root!=null){
            q.add(root);
        }
        while(!q.isEmpty()){
            int n = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0 ; i <n;i++){
                TreeNode cur = q.poll();
                temp.add(cur.val);
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
            result.add(temp);
        }

        return result;
    }


}
