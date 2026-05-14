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
    static class Pair{
        TreeNode node;
        int idx;

        public Pair(TreeNode node,int idx){
            this.node=node;
            this.idx=idx;
        }
    }
    static int width(TreeNode root,Deque<Pair>qu){
        int maxx=0;
        qu.offer(new Pair(root,0));
        while(!qu.isEmpty()){

            int size=qu.size();
            int leftidx=qu.getFirst().idx;
            int rightidx=qu.getLast().idx;
            maxx=Math.max(maxx,(rightidx-leftidx+1));

            while(size>0){
                size--;
                Pair temp=qu.poll();
                TreeNode node=temp.node;
                int idx=temp.idx;

                if(node.left!=null){
                    qu.offer(new Pair(node.left,2*idx+1));
                }
                if(node.right!=null){
                 qu.offer(new Pair(node.right,2*idx+2));
                }
            }
        }
        return maxx;
    }
    public int widthOfBinaryTree(TreeNode root) {
        Deque<Pair>qu=new LinkedList<>();
        return width(root,qu);
    }
}