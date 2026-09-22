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
    public void diameter(TreeNode root,int []maxx){
        maxdepth(root,maxx);
    }
    public int maxdepth(TreeNode root,int []maxx){
        if(root==null) return 0;
        int lh=maxdepth(root.left,maxx);
        int rh=maxdepth(root.right,maxx);
        maxx[0]=Math.max(maxx[0],lh+rh);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int []maxx=new int[1];
        diameter(root,maxx);
        return maxx[0];
    }
}