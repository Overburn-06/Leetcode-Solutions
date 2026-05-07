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
    static void leveltraverse(TreeNode root,List<List<Integer>>res,Queue<TreeNode>qu){

        qu.add(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            ArrayList<Integer>arr=new ArrayList<>();
            for(int i=0;i<size;i++){
                if(qu.peek().left!=null){
                    qu.add(qu.peek().left);
                }
                if(qu.peek().right!=null){
                    qu.add(qu.peek().right);
                }
                arr.add(qu.peek().val);
                qu.remove();
            }
            res.add(arr);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        Queue<TreeNode>qu=new LinkedList<>();
        if(root==null) return res;
        leveltraverse(root,res,qu);
        return res;
    }
}