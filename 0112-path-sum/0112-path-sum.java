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
    static boolean path(TreeNode root,int t,int sum){
        if(root==null)return false;
        sum+=root.val;
        if(path(root.left,t,sum)||path(root.right,t,sum)) return true;
        if(sum==t && isLeaf(root)) return true;
        return false;
    }
    static boolean isLeaf(TreeNode root){
        if(root.left==null&&root.right==null) return true;
        return false;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        if(root==null)return false;
        return path(root,targetSum,sum);

    }
}