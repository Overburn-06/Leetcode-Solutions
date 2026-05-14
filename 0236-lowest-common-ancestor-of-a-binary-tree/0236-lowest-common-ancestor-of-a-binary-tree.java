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
    static boolean lca(TreeNode root,ArrayList<Integer>arr,TreeNode target){
        if(root==null) return false;
        arr.add(root.val);
        if(root==target){
            return true;
        }
        if(lca(root.left,arr,target)||lca(root.right,arr,target)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<Integer>pathp=new ArrayList<>();
        ArrayList<Integer>pathq=new ArrayList<>();
        lca(root,pathp,p);
        lca(root,pathq,q);
        int ans=0;
        for(int i=0;i<Math.min(pathq.size(),pathp.size());i++){
            if(pathp.get(i).equals(pathq.get(i))){
                ans=pathq.get(i);
            }
        }
        
        TreeNode res=new TreeNode(ans);
        return res;
    }
}