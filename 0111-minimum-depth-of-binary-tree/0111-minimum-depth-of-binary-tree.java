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
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null && root.right==null) return 1;
        int lr;
        if(root.left!=null){
            lr=minDepth(root.left);
        }else{
            lr=Integer.MAX_VALUE;
        }
        int rr;
        if(root.right!=null){
            rr=minDepth(root.right);
        }else{
            rr=Integer.MAX_VALUE;
        }
        return 1+Math.min(lr,rr);
    }
}