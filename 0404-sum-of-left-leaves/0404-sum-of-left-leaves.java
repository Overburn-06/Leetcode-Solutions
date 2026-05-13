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
    static int left_sum(TreeNode root,Queue<TreeNode>qu){
        int sum=0;
        qu.offer(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            ArrayList<Integer>temp=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode n=qu.poll();
                
                if(n.left!=null&&isLeaf(n.left)){
                    temp.add(n.left.val);
                }
                if(n.left!=null){
                    qu.offer(n.left);
                }
                if(n.right!=null){
                    qu.offer(n.right);
                }
            }
            for(int i=0;i<temp.size();i++){
                sum+=temp.get(i);
            }
            // arr.add(temp);
        }
        // for(int i=0;i<arr.size();i++){
        //     System.out.print(arr.get(i)+" ");
        // }
        return sum;
    }
    static boolean isLeaf(TreeNode root){
        if(root.left==null && root.right==null) return true;
        return false;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        // ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        Queue<TreeNode>qu=new LinkedList<>();
        return left_sum(root,qu);
    
    }
}