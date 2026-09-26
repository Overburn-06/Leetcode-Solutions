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
    public void traversal(TreeNode root,StringBuilder res,List<String>arr){
        if(root==null)return;
        int length=res.length();
        if(length==0) res.append(root.val);
        else{
            res.append("->");
            res.append(root.val);
        }
        if(root.left==null && root.right==null){
            arr.add(res.toString());
        }
        else{
            traversal(root.left,res,arr);
            traversal(root.right,res,arr);
        }
        res.setLength(length);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>arr=new ArrayList<>();
        StringBuilder res=new StringBuilder();
        traversal(root,res,arr);
        // res.append(Integer.toString(root.val));
        // if(root.left==null && root.right==null){
        //     arr.add(res.toString());
        //     return arr;
        // }
        // if(root.left!=null)traversal(root.left,res,arr);
        // if(root.right!=null)traversal(root.right,res,arr);
        return arr;
    }
}