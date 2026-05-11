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
    static boolean ismirror(TreeNode left,TreeNode right){
        if(left==null||right==null){
            return left==right;
        }
        if(left.val!=right.val) return false;

        return ismirror(left.left,right.right)&&ismirror(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        return ismirror(root,root);
    }
}