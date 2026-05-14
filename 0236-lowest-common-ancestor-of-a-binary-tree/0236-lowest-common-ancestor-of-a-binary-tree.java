/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static boolean lca(TreeNode root,ArrayList<TreeNode>arr,TreeNode target){
        if(root==null) return false;
        arr.add(root);
        if(root==target){
            return true;
        }
        if(lca(root.left,arr,target)){
            return true;
        }
        if(lca(root.right,arr,target)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode>pathp=new ArrayList<>();
        ArrayList<TreeNode>pathq=new ArrayList<>();
        lca(root,pathp,p);
        lca(root,pathq,q);
        TreeNode ans=root;
        for(int i=0;i<Math.min(pathq.size(),pathp.size());i++){
            if(pathp.get(i)==(pathq.get(i))){
                ans=pathq.get(i);
            }
        }
        return ans;
    }
}