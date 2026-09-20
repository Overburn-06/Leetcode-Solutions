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
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        Queue<TreeNode>qu=new LinkedList<>();
        qu.offer(root);
        int depth=1;
        while(!qu.isEmpty()){
            int n=qu.size();
            while(n>0){
                TreeNode temp=qu.poll();
                if(temp.left!=null){
                    qu.offer(temp.left);
                }
                if(temp.right!=null){
                    qu.offer(temp.right);
                }
                n--;
            }
            depth++;
        } 
        return depth-1;
    }
}