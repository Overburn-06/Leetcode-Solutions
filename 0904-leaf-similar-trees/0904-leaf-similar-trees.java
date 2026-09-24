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
    // public List<Integer> bfs(TreeNode root){
    //     List<Integer>arr=new ArrayList<>();
    //     Queue<TreeNode>qu=new LinkedList<>();
    //     qu.offer(root);
    //     while(!qu.isEmpty()){
    //         int n=qu.size();
    //         while(n>0){
    //             TreeNode temp=qu.poll();
    //             if((temp.left==null && temp.right==null)){
    //                 arr.add(temp.val);
    //             }
    //             if(temp.left!=null){
    //                 qu.offer(temp.left);
    //             }
    //             if(temp.right!=null){
    //                 qu.offer(temp.right);
    //             }
    //             n--;
    //         }
    //     }
    //     return arr;
    // }
    public void dfs(TreeNode root,List<Integer>arr){
        if(root==null) return;
        dfs(root.left,arr);
        dfs(root.right,arr);
        if(root.left==null && root.right==null) arr.add(root.val);
    }
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer>r1=new ArrayList<>();
            List<Integer>r2=new ArrayList<>();
            dfs(root1,r1);
            dfs(root2,r2);
        return r1.equals(r2);
    }
}