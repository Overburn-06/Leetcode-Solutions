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
    static int depth(TreeNode root){
       Queue<TreeNode>qu=new LinkedList<>();
       qu.offer(root);
       int depth=1;
       while(!qu.isEmpty()){
        int size=qu.size();
        for(int i=0;i<size;i++){
            TreeNode node=qu.poll();
            if(node.left==null&&node.right==null) return depth;
            if(node.left!=null){
                qu.offer(node.left);
            }
            if(node.right!=null){
                qu.offer(node.right);
            }
        }
        depth++;
       }
       return depth;
    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        return depth(root);
    }
}