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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            while(n > 0){
                TreeNode temp = q.poll();
                list.add(temp.val);
                n--;
                if(temp.left!= null) q.offer(temp.left);
                if(temp.right!= null) q.offer(temp.right);
            }
            res.add(new ArrayList<>(list));
        }
        return res;
    }
}
