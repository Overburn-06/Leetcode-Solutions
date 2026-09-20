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
    public int min(TreeNode root){
        Queue<TreeNode>qu=new LinkedList<>();
        qu.offer(root);
        int depth=1;
        while(!qu.isEmpty()){
            int n=qu.size();
            for(int i=0;i<n;i++){
                TreeNode temp=qu.poll();
                if(temp.left==null && temp.right==null){
                    return depth;
                }
                if(temp.left!=null) qu.offer(temp.left);
                if(temp.right!=null) qu.offer(temp.right);
            }
            depth++;
        }
        return depth;
    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return min(root);
    }
}