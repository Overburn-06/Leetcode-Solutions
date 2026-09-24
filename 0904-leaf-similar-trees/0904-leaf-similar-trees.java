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
    public void dfs(TreeNode root,List<Integer>arr){
        if(root==null) return;
        dfs(root.left,arr);
        if(root.left==null && root.right==null) arr.add(root.val);
        dfs(root.right,arr);
    }
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer>r1=new ArrayList<>();
            List<Integer>r2=new ArrayList<>();
            dfs(root1,r1);
            dfs(root2,r2);
        return r1.equals(r2);
    }
}