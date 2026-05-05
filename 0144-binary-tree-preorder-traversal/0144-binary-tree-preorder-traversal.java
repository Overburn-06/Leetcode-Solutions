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
    // static void pre(TreeNode root,List<Integer>arr){
    //     if(root==null) return;
    //     arr.add(root.val);
    //     pre(root.left,arr);
    //     pre(root.right,arr);

    //     return;
    // }

    static void pre(TreeNode root,List<Integer>arr){
        if(root==null) return ;
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            if(root.right!=null){
                st.push(root.right);
            }if(root.left!=null){
                st.push(root.left);
            }
            arr.add(root.val);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>arr=new ArrayList<>();
        pre(root,arr);
        return arr;
    }
}