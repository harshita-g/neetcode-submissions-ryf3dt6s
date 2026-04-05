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
//bhoomikas solution 
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        ans = st(root);
        ArrayList<Integer> tempp = new ArrayList<>();
        for (int i = 0 ; i <ans.size();i++){
            List<Integer> level = ans.get(i);
            tempp.add(level.get(level.size()-1));

        }
        return tempp;

    }

    public List<List<Integer>> st (TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root==null){
            return res;
        }
        Queue<TreeNode> q1= new LinkedList<>(); 
        q1.add(root);
        while(!q1.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
            int n = q1.size();
            for (int i = 0 ; i <n ;i++){
                TreeNode cur = q1.poll();
                if (cur.left!=null){
                    q1.add(cur.left);
                }
                if (cur.right!=null){
                    q1.add(cur.right);
                }
                temp.add(cur.val);
            }
        res.add(temp);
            
        }
        return res;



        
    }
}
