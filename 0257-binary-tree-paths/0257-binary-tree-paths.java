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
    public void traversal(TreeNode root,String res,List<String>arr){
        res+="->"+root.val;
        if(root.left==null && root.right==null){
            arr.add(res);
            return;
        }
        if(root.left!=null)traversal(root.left,res,arr);
        if(root.right!=null)traversal(root.right,res,arr);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>arr=new ArrayList<>();
        String res=Integer.toString(root.val);
        if(root.left==null && root.right==null){
            arr.add(res);
            return arr;
        }
        if(root.left!=null)traversal(root.left,res,arr);
        if(root.right!=null)traversal(root.right,res,arr);
        return arr;
    }
}