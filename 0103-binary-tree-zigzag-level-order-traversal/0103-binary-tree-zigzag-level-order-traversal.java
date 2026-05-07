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
    static void zigzagtraversal(TreeNode root,List<List<Integer>>res,Queue<TreeNode>qu){
        qu.add(root);
        boolean path=true;
        while(!qu.isEmpty()){
            int size=qu.size();
            ArrayList<Integer>arr=new ArrayList<Integer>();
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
            // for(int i:arr){
            //     System.out.print(i+" ");
            // }
            if(path==false) Collections.reverse(arr);
            // for(int i:arr){
            //     System.out.print(i+" ");
            // }
            res.add(arr);
            if(path==true) path=false;
            else path=true;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        Queue<TreeNode>qu=new LinkedList<>();
        if(root==null) return res;
        zigzagtraversal(root,res,qu);
        return res;
    }
}