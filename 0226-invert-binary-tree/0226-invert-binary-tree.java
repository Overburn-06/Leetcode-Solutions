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
// class Solution {
//     public TreeNode invertTree(TreeNode root) {
//         if(root==null) return root;
//        Queue<TreeNode>qu=new LinkedList<>();
//        qu.offer(root);
//        while(!qu.isEmpty()){
//         int n=qu.size();
//         while(n>0){
//             TreeNode temp=qu.poll();
//             if(temp.left!=null || temp.right!=null){
//                 TreeNode t=temp.left;
//                 temp.left=temp.right;
//                 temp.right=t;
//             }
//             if(temp.left!=null){
//                 qu.offer(temp.left);
//             }
//             if(temp.right!=null){
//                 qu.offer(temp.right);
//             }
//             n--;
//         }
//        }
//        return root;
//     }
// }


class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}